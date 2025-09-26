# VALIDATION_STATUS.md

Este arquivo documenta o status de validação de cada módulo e tela principal do projeto. O status é definido por um dos seguintes valores: [Validado | Em Teste | Falha | Pendente].

## Status dos Módulos

| Módulo | Status | Versão | Data | Notas |
| --- | --- | --- | --- | --- |
| Documentação (`/docs`) | Validado | 0.2.1 | 26/09/2025 | Estrutura da documentação completa e alinhada. |
| ASR - Reconhecimento de Fala | Em Teste | 0.2.0 | 26/09/2025 | Função de teste `startTestRecognition` implementada para depuração. |
| TTS - Síntese de Fala | Em Teste | 0.2.0 | 26/09/2025 | Módulo criado com função de teste `startTestToSpeech` para depuração. |
| Armazenamento de Dados | Pendente | - | - | A ser implementado. |
| Gerenciamento de Estado | Pendente | - | - | A ser implementado. |
| Módulo de Treino de Palavras | Pendente | - | - | A ser implementado. |
| Módulo de Treino de Frases | Pendente | - | - | A ser implementado. |
| Módulo de Exercícios de Respiração | Pendente | - | - | Implementação Futura. Fora do escopo atual. |
| Módulo de Articulação de Fonemas | Pendente | - | - | Implementação Futura. Fora do escopo atual. |

## Status das Telas (UI)

| Tela | Status | Versão | Data | Notas |
| --- | --- | --- | --- | --- |
| `MainActivity` | Em Teste | 0.2.1 | 26/09/2025 | Navegação principal com NavHost implementada. |
| Splash Screen (Tela 1) | Validado | 0.2.1 | 26/09/2025 | Exibe imagem univesp.jpg, timer de 3s ou toque para navegação. Funcionou corretamente. |
| `HomeScreen` (Tela 2) | Validado | 0.2.1 | 26/09/2025 | Exibe apenas a versão atual do app. Funcionou corretamente. |
| `DebugScreen` | Em Teste | 0.2.0 | 26/09/2025 | Tela criada com botões para testar módulos ASR e TTS. |
| `ProfessionalRegistrationScreen` | Pendente | - | - | O arquivo de esqueleto foi criado. |
| `ProfessionalDashboardScreen` | Pendente | - | - | O arquivo de esqueleto foi criado. |
| `PatientRegistrationScreen` | Pendente | - | - | O arquivo de esqueleto foi criado. |
| `PatientDashboardScreen` | Pendente | - | - | O arquivo de esqueleto foi criado. |
| `ExercisesScreen` | Pendente | - | - | O arquivo de esqueleto foi criado. |
| `PhraseTrainingScreen` | Pendente | - | - | O arquivo de esqueleto foi criado. |
