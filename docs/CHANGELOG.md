# CHANGELOG.MD
# Propósito: Registra o histórico de alterações, versões
#            e funcionalidades implementadas no App X.
#
# Este arquivo é parte da documentação do FonoVirtual_V2.
# Ele é essencial para rastrear a evolução do projeto,
# entender as mudanças entre versões e o progresso geral.
#
# Interconexões da Documentação (Fluxo Sugerido):
#   [Prompt Geral] -> CONTEXT.MD ------> PATHS_FILES.MD
#                     |                     &
#                     |                  PATHS_SCREENS.MD
#                     |                        |
#                     V                        V
#              CHANGELOG.MD (Este Arquivo) <---- VALIDATION_STATUS.MD
#
# Legenda: Lista as versões em ordem decrescente, com as mudanças mais recentes no topo.
# ---

## Reestruturação da Documentação (/docs) - Marco de Organização

- **Status Geral da Mudança:** `Concluído`
- **Resumo da Mudança:**
  Foi realizada uma reestruturação significativa dos arquivos de documentação localizados no diretório `/docs`. O objetivo principal foi aumentar a clareza, consistência, modularidade e manutenibilidade da documentação do projeto "Fonoaudióloga Virtual".
  As principais alterações incluem:
    - **`CONTEXT.MD`**: Consolidado como o Guia Metodológico Central, definindo regras gerais de desenvolvimento de software, diretrizes para IAs (Code Assistants), e padrões universais para a criação e formatação de toda a documentação no diretório `/docs`.
    - **`RULES_FILE.MD`**: Estabelecido como o Guia Operacional Mandatório para a IA, detalhando o processo passo a passo que a IA deve seguir. Foram incorporadas seções cruciais como "Regras de Ouro (Princípios Fundamentais de Desenvolvimento)", "ANTI-LOOPING MECHANISM", "ANTI-REGRESSÃO MECHANISM", e "Determinação de Documentos a Atualizar".
    - **`SPECIFICATION_FOR_APP.MD`**: Seu papel foi clarificado para focar exclusivamente nas especificações, funcionalidades, arquitetura e status de desenvolvimento do projeto específico "Fonoaudióloga Virtual". A seção que continha diretrizes gerais (o "Prompt Geral de Desenvolvimento - App") foi marcada como temporária e está prestes a ser removida, uma vez que seu conteúdo generalizável foi migrado para `CONTEXT.MD` e `RULES_FILE.MD`.
    - **Documentos Auxiliares (`PATHS_FILES.MD`, `PATHS_SCREENS.MD`, `VALIDATION_STATUS.MD`, `CHANGELOG.MD`)**: Seus propósitos e interconexões foram reforçados dentro da nova estrutura, com `RULES_FILE.MD` e `CONTEXT.MD` guiando sua atualização.
- **Impacto Principal:**
  - Melhoria substancial na organização e governança da documentação do projeto.
  - Facilitação da consulta e aplicação das diretrizes por IAs e desenvolvedores.
  - Preparação do terreno para a remoção de conteúdo duplicado (o "Prompt Geral") de dentro do `SPECIFICATION_FOR_APP.MD`, tornando-o mais enxuto e focado.
- **Próximos Passos Imediatos Relacionados:**
  - Remoção da seção de diretrizes gerais temporárias do arquivo `SPECIFICATION_FOR_APP.MD`.

## 1.0.4 - 30/09/2025 - Implementação do Modo Claro

- **Status Geral da Versão:** `✅ TOTALMENTE VALIDADO E ESTÁVEL`
- **Resumo da Implementação:** Conversão completa do aplicativo do modo escuro para modo claro, garantindo
  melhor legibilidade e interface mais limpa com fundo branco e textos pretos.

### **Atualizações do Sistema de Tema (30/09/2025):**
- **Theme.kt - Configuração Principal:**
  - **Modo claro forçado:** Aplicativo sempre usa tema claro independente das configurações do sistema
  - **Esquema de cores atualizado:**
    - Background: Branco (`Color.White`)
    - Surface: Branco (`Color.White`)
    - Textos sobre fundo/superfície: Preto (`Color.Black`)
    - Cor primária mantida: Azul (`Color(0xFF1976D2)`)
  - **Parâmetro `darkTheme` sempre false:** Garantia de modo claro constante

### **Atualizações da HomeScreen (30/09/2025):**
- **Interface Visual Convertida para Modo Claro:**
  - **Fundo alterado:** De preto para branco (`Color.White`)
  - **Textos convertidos:** Todos os textos de branco para preto (`Color.Black`)
    - Título "FonoVirtual" agora em preto
    - Versão do app em preto
    - "Projeto Integrador VI" em preto
  - **Preview atualizado:** Background branco (`0xFFFFFFFF`)
  - **Documentação atualizada:** Comentários refletem modo claro

### **Melhorias de Usabilidade:**
- **Legibilidade aprimorada:** Contraste otimizado com fundo branco e texto preto
- **Consistência visual:** Todas as telas seguem o novo padrão de modo claro
- **Interface moderna:** Design limpo e profissional mantido

### **Componentes Validados:**
- **Theme.kt:** Sistema de cores claro implementado e funcional
- **HomeScreen.kt:** Interface convertida e testada no modo claro
- **SplashScreen.kt:** Já estava compatível com fundo branco
- **Demais telas:** Herdam automaticamente o novo tema claro

- **Status de Validação:** ✅ **MODO CLARO COMPLETAMENTE VALIDADO**
  - Tema claro aplicado em todo o aplicativo
  - Legibilidade otimizada
  - Interface consistente e profissional
  - Compatibilidade mantida com todas as funcionalidades existentes

## 1.0.3 - 29/09/2025 - Implementação do Exercício de Reconhecimento Simples

- **Status Geral da Versão:** `✅ TOTALMENTE VALIDADO E ESTÁVEL`
- **Resumo da Implementação:** Criação do primeiro módulo de exercícios completo e funcional, focando em reconhecimento
  de palavras organizadas por número de sílabas (2-5 sílabas). **TODAS AS FUNCIONALIDADES TESTADAS E APROVADAS.**

### **Atualizações Recentes da HomeScreen (29/09/2025):**
- **Interface Visual Modernizada:**
  - **Modo Escuro implementado:** Fundo preto com textos brancos para melhor contraste
  - **Layout otimizado:** Melhor espaçamento vertical e horizontal entre elementos
  - **Botões uniformizados:** Todos os botões agora têm largura completa (`fillMaxWidth()`)

- **Reorganização dos Botões:**
  - **"Cadastro/Seleção de Profissional e Paciente"** → **"Cadastro"** (simplificado)
  - **"Teste Rápido"** (mantido, navega para exercícios)
  - **"Atividades"** (novo botão adicionado)
  - **"Resultados"** (novo botão adicionado)
  - **"Debug"** (mantido na última posição)

- **Melhorias na Tipografia:**
  - Título "FonoVirtual" em branco com estilo `headlineLarge`
  - Informações de versão e projeto em branco para contraste no fundo escuro
  - Textos centralizados para melhor apresentação

### **Atualização no Banco de Palavras (29/09/2025):**
- **WordsRepository.kt:**
  - **Palavras de 3 sílabas atualizadas:**
    - "borboleta" → "projeto"
    - "telefone" → "trabalho"
  - **Palavras de 4 sílabas finalizadas:**
    - Lista final: computação, integrador, chocolate, telefone, abacaxi
  - **Palavras de 5 sílabas finalizadas:**
    - Lista final: geografia, matemática, aplicativo, comunicação, universidade
  - **Listas finais por sílabas:**
    - 2 sílabas: casa, bola, pato, mesa, vida
    - 3 sílabas: **projeto**, caminhar, **trabalho**, médico, música
    - 4 sílabas: computação, **integrado**, chocolate, telefone, abacaxi
    - 5 sílabas: geografia, matemática, aplicativo, comunicação, universidade
  - Documentação atualizada em PATHS_SCREENS.md para refletir todas as mudanças

### **Funcionalidades Principais Implementadas e Validadas:**
- **SimpleRecognitionExerciseScreen:**
  - Interface de seleção de nível por sílabas (2-5)
  - Integração com ASR para reconhecimento contínuo (sem botão)
  - Integração com TTS para exemplos sonoros
  - Sistema de navegação entre palavras
  - Verificação automática de acertos baseada em comparação de texto
  - Status visual colorido (verde quando ouvindo, vermelho em erro)
  - **ExerciseResultScreen:**
    - Cálculo e exibição de percentual de acerto (0-100%)
    - Estatísticas detalhadas (acertos, erros, total)
    - Feedback motivacional baseado na performance
    - Interface visual limpa com cores padrão do app
    - Navegação para novo exercício ou retorno à home
  - **SimpleRecognitionExerciseViewModel:**
    - Lógica de negócio para exercícios
    - Cálculo automático de estatísticas
    - Gerenciamento de estado ASR/TTS
    - Contadores de acertos e erros
  - **WordsRepository:**
    - Repositório de palavras organizadas por sílabas
    - Suporte para 2-5 sílabas com palavras em português
    - Interface para obter listas e contadores disponíveis
  - **WordExercise (Modelo de Dados):**
    - Estrutura de dados para exercícios
    - Suporte a tentativas e histórico

- **Melhorias Técnicas:**
  - **Navegação Aprimorada:**
    - Rota `exercise_result/{accuracy}/{correct}/{total}` para passar estatísticas
    - Integração completa entre todas as telas do fluxo
    - Gestão correta da pilha de navegação
  - **Integração ASR/TTS:**
    - Escuta contínua sem necessidade de botão
    - Reprodução automática de exemplos
    - Verificação inteligente de acertos
  - **Interface do Usuário:**
    - Design limpo e consistente
    - Feedback visual em tempo real
    - Cores padrão do app mantidas
    - Botões sempre visíveis para melhor UX

- **Correções e Ajustes:**
  - Corrigida navegação que ficava "presa" na última palavra
  - Implementado cálculo correto de percentual de acerto
  - Ajustadas cores para manter consistência visual
  - Removida lógica de cores dinâmicas por pontuação

- **Arquivos Criados/Modificados:**
  - `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/recognition/SimpleRecognitionExerciseScreen.kt` (Novo)
  - `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/recognition/SimpleRecognitionExerciseViewModel.kt` (Novo)
  - `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/result/ExerciseResultScreen.kt` (Modificado)
  - `app/src/main/java/com/example/fonovirtual_v2/data/exercises/recognition/WordsRepository.kt` (Novo)
  - `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/recognition/model/WordExercise.kt` (Novo)
  - `app/src/main/java/com/example/fonovirtual_v2/MainActivity.kt` (Modificado)
  - `app/src/main/java/com/example/fonovirtual_v2/ui/home/HomeScreen.kt` (Modificado)

- **Status de Validação:** ✅ **TODOS OS COMPONENTES VALIDADOS**
  - Fluxo completo testado e funcionando
  - Cálculo de estatísticas correto
  - Navegação entre telas estável
  - Interface responsiva e intuitiva

## 1.0.2 - 29/09/2025 - Validação do Módulo ASR e Tela de Teste

- **Status Geral da Versão:** `Validado`
- **Commit Hash:** `43f679c`
- **Resumo da Validação:** O módulo ASR (VoskAsrModule) e a tela de teste ASR (AsrTestScreen) foram completamente validados. A funcionalidade de reconhecimento de voz está operando corretamente, incluindo:
  - Gerenciamento de permissão do microfone
  - Inicialização do módulo Vosk
  - Captura e processamento de áudio
  - Exibição de resultados parciais e finais
  - Tratamento adequado de erros

- **Componentes Validados:**
  - AsrTestScreen e AsrTestViewModel: UI e lógica de negócios
  - VoskAsrModule: Funcionalidade core de ASR
  - Integração com sistema de permissões Android
  - Navegação via DebugScreen

- **Impacto e Melhorias:**
  - Interface mais robusta e amigável para testes de ASR
  - Feedback claro sobre status do reconhecimento
  - Base sólida para implementação futura das telas de exercícios

- **Próximos Passos:**
  - Implementar telas de exercícios usando o módulo ASR validado
  - Desenvolver lógica de avaliação de pronúncia
  - Integrar com módulo TTS para feedback por voz

## 1.0.1 - DD/MM/AAAA - Criação e Validação Inicial da UI da AsrTestScreen

- **Status Geral da Versão:** `Em Teste`
- **Resumo da Validação:** Criada a estrutura para a tela de teste de ASR (`AsrTestScreen.kt` e `AsrTestViewModel.kt`). A UI inicial (Draft) da `AsrTestScreen.kt` foi validada, confirmando que renderiza corretamente e é acessível via navegação pela `DebugScreen`. A navegação foi atualizada, substituindo o placeholder anterior. Foram adicionadas as strings necessárias para a UI e removidas as do placeholder. A versão do aplicativo foi incrementada para "1.0.1".

- **Histórico de Adições e Modificações da v1.0.1 (Rastreabilidade):**
  - **Criação de Novos Arquivos de UI para Teste ASR:**
    - `app/src/main/java/com/example/fonovirtual_v2/ui/asr_test/AsrTestScreen.kt`: Contém o Composable para a tela de teste ASR, com UI inicial (botão, labels de status e campos de resultado) e uso de `stringResource`. UI inicial validada.
    - `app/src/main/java/com/example/fonovirtual_v2/ui/asr_test/AsrTestViewModel.kt`: ViewModel básico para a `AsrTestScreen`.
  - **Atualização da Navegação Principal (`MainActivity.kt`):
    - A rota `"asr_test_screen"` no `NavHost` agora aponta para o Composable `AsrTestScreen`.
    - O Composable `PlaceholderAsrTestScreen` foi removido do arquivo.
  - **Atualização dos Recursos de String (`strings.xml`):
    - Adicionadas novas strings para a `AsrTestScreen`.
    - Removida a string `title_screen_asr_test_placeholder`.
  - **Atualização da Versão no Gradle (`app/build.gradle.kts`):
    - `versionName` alterado para `"1.0.1"`.
    - `versionCode` incrementado para `2`.

- **Funcionalidades Chave Impactadas na v1.0.1:**
  - **Adicionado:**
    - `AsrTestScreen.kt` (ui.asr_test): Nova tela com UI inicial validada para teste de ASR.
    - `AsrTestViewModel.kt` (ui.asr_test): ViewModel para `AsrTestScreen`.
  - **Modificado:**
    - `MainActivity.kt`: Navegação para ASR atualizada, placeholder removido.
    - `strings.xml` (res/values): Adicionadas strings para `AsrTestScreen`, removida string de placeholder.
    - `app/build.gradle.kts`: Versão do app atualizada.
  - **Impacto:**
    - A `DebugScreen` agora navega para uma tela de teste ASR estruturada (`AsrTestScreen.kt`) com UI inicial funcional. A lógica de ASR ainda precisa ser implementada.
    - O projeto está preparado para a implementação da funcionalidade de teste ASR na nova tela.

- **Documentação (`/docs`) para v1.0.1:**
  - Todos os arquivos (`CONTEXT.MD`, `PATHS_FILES.MD`, `PATHS_SCREENS.MD`, `VALIDATION_STATUS.MD`, `CHANGELOG.MD`) serão atualizados para refletir o status da v1.0.1.

## 1.0.0 - DD/MM/AAAA - Estabilização do Módulo ASR, Correção de Build, Sincronização de Versão e Preparação do Teste ASR

- **Status Geral da Versão:** `Em Teste`
- **Resumo da Validação:** O módulo de Reconhecimento Automático de Fala (ASR), `VoskAsrModule.kt`, teve sua lógica de inicialização criticamente corrigida. A `HomeScreen.kt` foi atualizada para exibir a versão do app dinamicamente (`BuildConfig.VERSION_NAME`, atualmente "1.0"). A `DebugScreen.kt` agora inclui um botão "Testar ASR" que navega para uma tela placeholder (`PlaceholderAsrTestScreen` definida em `MainActivity.kt`). Foram adicionadas as strings necessárias em `strings.xml` para estas alterações. Com estas correções e adições, o build do projeto foi validado, a aplicação pode ser executada, e a documentação foi sincronizada para `v1.0.0`, permitindo o início dos testes da funcionalidade ASR.

- **Histórico de Correções e Adições da v1.0.0 (Rastreabilidade):**
  - **Correção da Inicialização do Módulo ASR (`VoskAsrModule.kt`):**
    - Resolveu o erro de compilação "Argument type mismatch".
  - **Adição de Recursos de String (`strings.xml`):
    - Para erros ASR, botão debug ASR, e tela placeholder ASR.
  - **Atualização da Exibição de Versão (`HomeScreen.kt`).**
  - **Atualização da Tela de Depuração (`DebugScreen.kt`):**
    - Botão "Testar ASR" navegando para rota `"asr_test_screen"`.
  - **Atualização da Navegação Principal (`MainActivity.kt`):
    - Rota `"asr_test_screen"` apontando para `PlaceholderAsrTestScreen`.
  - **Sincronização do `versionName` e `buildConfig` no Gradle.**
  - **Validação do Build.**

- **Funcionalidades Chave Impactadas na v1.0.0:**
  - `VoskAsrModule.kt`, `HomeScreen.kt`, `DebugScreen.kt`, `MainActivity.kt`, `strings.xml`.
  - A funcionalidade de ASR pôde ser desenvolvida e testada.

- **Documentação (`/docs`) para v1.0.0:**
  - Atualizada para refletir o status da v1.0.0.

## 0.4.0 - DD/MM/AAAA - Implementação e Validação da Funcionalidade de Teste TTS

- **Status Geral da Versão:** `Validado`
- **Funcionalidades Implementadas e Validadas na v0.4.0:**
  - `TextToSpeechModule.kt`, `TtsTestViewModel.kt`, `TtsTestScreen.kt`, `Theme.kt`.
  - Recursos em `strings.xml` para TTS.
  - `DebugScreen.kt`: Botão "Testar TTS" funcional.
  - `MainActivity.kt`: Rota para `TtsTestScreen`.

## 0.3.2 - DD/MM/AAAA - Ajustes Textuais na HomeScreen (Validado)

## 0.3.1 - DD/MM/AAAA - Botões de Navegação na HomeScreen e Tela de Debug (Validado)

## 0.3.0 - Início do novo ciclo de desenvolvimento

## 0.2.1 - SplashScreen e HomeScreen (Validado)

## 0.2.0 - Primeira Versão Depurável

## 0.1.0 - Início do Projeto
