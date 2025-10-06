# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-09-30

### Adicionado
- Interface `NotificacaoStrategy` para padronizar serviços de notificação

### Corrigido
- Desacoplamento do serviço central de notificação, facilitando extensão e manutenção

### Modificado
- Refatoração dos serviços `EmailService`, `SmsService` e `PushService` para implementar o padrão Strategy
- `NotificacaoService` agora utiliza lista de estratégias, tornando o envio flexível