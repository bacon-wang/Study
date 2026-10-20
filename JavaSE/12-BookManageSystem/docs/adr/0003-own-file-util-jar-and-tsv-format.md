# 自写 file-utils.jar 负责原子读写，行格式用 Tab 分隔加反斜杠转义

文件读写放在独立的 `file-utils.jar`（`com.fileutil.FileUtil`）里，只提供 `readLines` 和原子替换的 `writeLines`：先写临时文件，再用 `ATOMIC_MOVE` 替换原文件，写到一半崩溃时原文件不受影响。行格式由图书系统的 `TsvTable` 负责：字段用 Tab 分隔，`\`、Tab、换行分别转义成 `\\`、`\t`、`\n`，首行是表头，读取时校验表头。

## Considered Options

- **CSV（RFC 4180）**：字段里有换行时，一条记录会跨多行，解析时要处理引号状态。反斜杠转义保证一条记录就是一行。
- **原来的 file-utils.jar**：把行格式、注释行、`.bak` 备份都放在 jar 里，图书系统改不了格式；有了原子写入，`.bak` 也是多余的。
