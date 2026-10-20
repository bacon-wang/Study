## Agent skills

### Issue tracker

Issues live as local markdown files under `.scratch/<feature>/`. See `docs/agents/issue-tracker.md`.

### Triage labels

Default vocabulary: `needs-triage`, `needs-info`, `ready-for-agent`, `ready-for-human`, `wontfix`. See `docs/agents/triage-labels.md`.

### Domain docs

Single-context: root `GLOSSARY.md` + `docs/adr/`. See `docs/agents/domain.md`.

### 开发方式

用户自己写实现代码和测试，不走 TDD（不用 `/tdd`）。

- 拆 ticket 时默认标 `ready-for-human`，不写测试步骤，也不把 red-green-refactor 写进验收标准。
- 除非用户明确要求，agent 不写实现代码和测试代码，只负责讲解、给提示和 review。

### 导航

- 规格和票据：`.scratch/book-manage-system/`（`spec.md` + `issues/`）。
- `lib/file-utils.jar` 的源码在 `../12-FileUtil/`，改完运行其中的 `build.sh` 打包，再复制到 `lib/`。
