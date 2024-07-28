> 提交 Pull Request (PR) 是在软件开发中，特别是在使用 Git 版本控制系统和平台如 GitHub、GitLab 或 Bitbucket 时，协作开发的关键步骤。以下是一个详细的 PR 提交流程：

如果你是fork项目到自己的仓库，请点击[这里跳转](#fork到自己的repo下提交pr)。

## 直接在项目仓库中提交PR
### 1. 克隆仓库
如果你还没有克隆仓库，请先将远程仓库克隆到本地。


```sh
git clone https://github.com/ayachensiyuan/FD_TeachingPlatform.git
# 或者
git clone https://gitee.com/ayachensiyuan/FD_TeachingPlatform.git
cd repository
```
### 2. 创建分支
为你的更改创建一个新的分支。分支名称应该简洁且描述性强。

```sh
git checkout -b feature/my-new-feature
```
### 3. 进行更改
在本地分支上进行代码修改和新增。确保在每次完成一部分工作后提交更改。

```sh
git add .
git commit -m "Add feature X"
```
### 4. 推送分支到远程仓库
将你的分支推送到远程仓库。这样，其他人可以看到你的更改。

```sh
git push origin feature/my-new-feature
```
### 5. 创建 Pull Request
- 登录到你使用的 Git 平台（GitHub、Gitee），导航到你推送分支的仓库，并找到 "Pull Request" 或 "Merge Request" 选项。

- 在 GitHub 上创建 Pull Request 的步骤：
打开仓库：打开你要提交 PR 的仓库。

- 选择 Pull Requests 选项卡：点击页面顶部的 "Pull Requests" 选项卡。
- 点击 "New Pull Request" 按钮：点击页面右侧的 "New Pull Request" 按钮。
- 选择分支：在 "Compare" 部分，选择你创建的分支。

> 填写 PR 信息：
标题：简明扼要地描述你的更改。
描述：详细说明你的更改，为什么需要这些更改以及如何测试这些更改。
创建 PR：点击 "Create Pull Request" 按钮。
### 6. 讨论和修改
提交 PR 后，项目维护者和其他贡献者可能会对你的代码进行审查。他们可能会提出意见或要求更改。你需要根据反馈进行相应的修改。

```sh
# 在本地进行修改
git add .
git commit -m "Address review comments"
```

```sh
# 推送修改到远程分支
git push origin feature/my-new-feature
```
## Fork到自己的Repo下提交PR
### 1. Fork 仓库
Fork 是在自己的 GitHub 账户下创建一个原始仓库的副本。

- 登录 GitHub：使用你的 GitHub 账户登录。
- 找到目标仓库：导航到你想要贡献的原始仓库页面。
- Fork 仓库：在仓库页面的右上角，点击 “Fork” 按钮。这样你就有了该仓库的一个副本，它将显示在你的 GitHub 账户下。
### 2. 克隆 fork 仓库
将你 fork 的仓库克隆到本地。

```sh
git clone https://github.com/your-username/repository.git
cd repository
```
### 3. 创建分支
为你的更改创建一个新的分支。

```sh
git checkout -b feature/my-new-feature
```
### 4. 进行更改
在本地分支上进行代码修改和新增。每完成一部分工作后提交更改。

```sh
# 进行代码修改
git add .
git commit -m "Add feature X"
```
### 5. 推送分支到 fork 仓库
将你的分支推送到你的 fork 仓库。

```sh
git push origin feature/my-new-feature
```
### 6. 创建 Pull Request
- 登录 GitHub，在你的 fork 仓库中创建一个 Pull Request，将更改提交到原始仓库。

- 打开你的 fork 仓库。
- 选择 Pull Requests 选项卡：点击页面顶部的 "Pull Requests" 选项卡。
- 点击 "New Pull Request" 按钮：点击页面右侧的 "New Pull Request" 按钮。
- 选择分支：在 "base repository" 中选择原始仓库，在 "base" 分支中选择要合并的目标分支（通常是 main 或 master），在 "compare" 分支中选择你要提交的分支。
    > 填写 PR 信息：
    > 标题：简明扼要地描述你的更改。
    > 描述：详细说明你的更改，为什么需要这些更改以及如何测试这些更改。
- 创建 PR：点击 "Create Pull Request" 按钮。
### 7. 讨论和修改
提交 PR 后，项目维护者和其他贡献者可能会对你的代码进行审查。他们可能会提出意见或要求更改。你需要根据反馈进行相应的修改。

```sh
# 在本地进行修改
git add .
git commit -m "Address review comments"

# 推送修改到远程分支
git push origin feature/my-new-feature
```
## 后续操作
### 7. 合并 PR
当所有评论都解决，并且项目维护者同意合并时，PR 将被合并到主分支。

合并 PR 的步骤（如果你有权限）：
在 GitHub 上打开 PR。
点击 "Merge Pull Request" 按钮。
确认合并：点击 "Confirm Merge" 按钮。
### 8. 清理分支
合并后，可以删除不再需要的分支以保持仓库整洁。

```sh
# 删除远程分支
git push origin --delete feature/my-new-feature

# 删除本地分支
git branch -d feature/my-new-feature
```
### 9. 同步主分支
确保你的本地主分支与远程主分支同步。

```sh
git checkout dev
git pull origin dev
```

