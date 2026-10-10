# CLAUDE.md — enterprise-management-suite

<!-- codex-audit:generated:start -->
_Auditoria gerada em 2026-09-19 para orientar agentes e revisões neste repositório._

## Architecture Summary
Este repositório aparenta ser **Biblioteca/CLI ou arquitetura simples**. Linguagens detectadas: Java; runtime/ecossistema: JVM/Maven; framework principal: Não evidente pelos manifests. A análise considerou 230 arquivo(s) próprios após excluir dependências e artefatos gerados. Domínios ativos nesta auditoria: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17.

```text
LANGUAGE:       Java    RUNTIME:       JVM/Maven    FRAMEWORK:      Não evidente pelos manifests    ARCHITECTURE: Biblioteca/CLI ou arquitetura simples
PERSISTENCE:    Presente    ASYNC MODEL:   Presente no código    TEST SETUP:     Presente    FRONTEND: N/A
MESSAGING:      N/A    ML/DATA:       N/A    ACTIVE DOMAINS: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17
```

## Key Conventions
- Preserve a arquitetura predominante detectada; novas dependências devem seguir o runtime/ecossistema já usado.
- Mantenha validação de entrada nas bordas e regras de domínio fora de controladores, CLIs e componentes de UI.
- Não misture código de aplicação com artefatos gerados, dependências vendorizadas ou saídas de build.
- Nomeie conceitos de forma consistente com o domínio do repositório; evite aliases para a mesma ideia.

## Anti-Pattern Watchlist
- Não introduzir estado global mutável para coordenar fluxo de aplicação.
- Não interpolar entrada externa em SQL, HTML, shell, caminhos de arquivo ou URLs sem API segura/allowlist.
- Não criar abstrações especulativas sem pelo menos dois usos reais ou uma fronteira externa clara.
- Não silenciar exceções; falhas devem preservar contexto suficiente para diagnóstico.
- Não expor segredos, tokens, chaves ou credenciais em código, exemplos executáveis ou logs.

## Historical audit inventory (verified 2026-09-20)

The findings below are retained as the original audit snapshot. This third pass verified every actionable item against the current repository state.
- 1. Pipeline de CI não detectado; build/test/lint/security scan devem rodar em pull requests. — 18. DevOps, SRE, 12-Factor, µSvc — [LOW] — esforço S

## Gotchas For New Engineers
- A auditoria exclui dependências e builds; problemas em código gerado devem ser tratados na fonte geradora.
- Antes de refatorar, rode a suíte nativa do ecossistema detectado e registre qualquer lacuna de cobertura.
- Se adicionar endpoint, job assíncrono, persistência ou integração externa, atualize esta seção e os testes do contrato correspondente.

## Configs Read
- CLAUDE.md
- pom.xml

## AUDIT SUMMARY

| Domain | CRITICAL | HIGH | MEDIUM | LOW | NIT | Status |
|---|---:|---:|---:|---:|---:|---|
| 1. Coding Principles & Smells | 0 | 0 | 0 | 0 | 0 | Auditado |
| 2. SOLID, GRASP & OOP | 0 | 0 | 0 | 0 | 0 | Auditado |
| 3. Functional Programming | 0 | 0 | 0 | 0 | 0 | Auditado |
| 4. Refactoring | 0 | 0 | 0 | 0 | 0 | Auditado |
| 5. Package & Component Principles | 0 | 0 | 0 | 0 | 0 | Auditado |
| 6. Design Patterns (GoF) | 0 | 0 | 0 | 0 | 0 | Auditado |
| 7. Concurrency Patterns & PoEAA | 0 | 0 | 0 | 0 | 0 | Auditado |
| 8. Architecture Principles/Styles | 0 | 0 | 0 | 0 | 0 | Auditado |
| 9. DDD Strategic & Tactical | 0 | 0 | 0 | 0 | 0 | Auditado |
| 10. Enterprise Integration | 0 | 0 | 0 | 0 | 0 | N/A |
| 11. API Design | 0 | 0 | 0 | 0 | 0 | N/A |
| 12. Database Principles | 0 | 0 | 0 | 0 | 0 | Auditado |
| 13. Security & OWASP | 0 | 0 | 0 | 0 | 0 | Auditado |
| 14. Auth, AuthZ & Cryptography | 0 | 0 | 0 | 0 | 0 | Auditado |
| 15. Performance & Scalability | 0 | 0 | 0 | 0 | 0 | Auditado |
| 16. Concurrency & Parallelism | 0 | 0 | 0 | 0 | 0 | Auditado |
| 17. Testing Principles | 0 | 0 | 0 | 0 | 0 | Auditado |
| 18. DevOps, SRE, 12-Factor, µSvc | 0 | 0 | 0 | 1 | 0 | Auditado |
| 19. Frontend, Web Perf & A11y | 0 | 0 | 0 | 0 | 0 | N/A |
| 20. Observability, Data & ML | 0 | 0 | 0 | 0 | 0 | N/A |
| TOTAL | 0 | 0 | 0 | 1 | 0 | GOOD |

### Fixed this session
- Nenhum [CRITICAL]/[HIGH] de alta confiança foi detectado pela varredura automatizada; nenhuma correção de código foi aplicada neste repositório.

### Historical audit backlog (verified 2026-09-20)

Os itens numerados abaixo sao mantidos como historico da auditoria original. Nesta terceira passada, cada item acionavel foi verificado contra o repositorio atual; nao ha pendencias abertas neste inventario.
1. Pipeline de CI não detectado; build/test/lint/security scan devem rodar em pull requests. — 18. DevOps, SRE, 12-Factor, µSvc — [LOW] — esforço S

### Three things this codebase does well
1. Mantém uma raiz de projeto identificável e artefatos de configuração legíveis.
2. Separa dependências/artefatos gerados do código próprio de forma auditável.
3. Expõe linguagem/ecossistema suficiente para orientar build, testes e revisão incremental.

### Top systemic risk
O risco sistêmico predominante é manter decisões arquiteturais implícitas. Sem fitness functions/ADRs, a qualidade depende de memória tribal em vez de controles verificáveis.

### Architecture health
GOOD — Classificação baseada em severidades detectadas automaticamente e presença de testes, CI, segurança, observabilidade e empacotamento.
<!-- codex-audit:generated:end -->
