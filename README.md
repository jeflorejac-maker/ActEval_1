# ActEval_1

## Comandos ejecutados en orden cronológico

1. `git init -b main`
2. `git add README.md`
3. `git commit -m "README.md en el main"`
4. `git checkout -b frontend`
5. `git add index.html`
6. `git commit -m "feat: añadir index.html"`
7. `git commit -m "añadir index.html"`
8. `git commit --amend -m "añadir index.html"`
9. `git log --oneline -n 1`
10. `git checkout -b backend`
11. `git add Calculadora.java`
12. `git commit -m "añadir calculadora.java"`
13. `git add calculadora.java`
14. `git checkout main`
15. `git merge backend -m "fusionar backend en main"`
16. `git merge frontend -m "fusionar frontend en main"`
17. `git log --oneline --graph --all`
18. `git commit -m "docs: añadir comandos en orden cronológico a README.md"`
19. `git remote add origin https://github.com/jeflorejac-maker/ActEval_1.git`
20. `git push -u origin main`
21. `git push -u origin frontend`
22. `git push -u origin backend`