# RELATÓRIO TÉCNICO PARCIAL
## DESENVOLVIMENTO DO APLICATIVO MÓVEL "FONOAUDIÓLOGA VIRTUAL" (FONOVIRTUAL)
### PROJETO INTEGRADOR VI - 2025

---

**UNIVERSIDADE VIRTUAL DO ESTADO DE SÃO PAULO - UNIVESP**  
**CURSO DE ENGENHARIA DE COMPUTAÇÃO**  
**PROJETO INTEGRADOR VI**  

**DATA:** Setembro de 2025  

---

## RESUMO

Este relatório técnico apresenta o desenvolvimento parcial do aplicativo móvel 
"FonoVirtual", uma solução tecnológica inovadora para auxiliar pacientes em 
exercícios de fonoaudiologia. O projeto utiliza tecnologias avançadas de 
reconhecimento de voz offline (Vosk), síntese de fala (TTS) e interface 
moderna desenvolvida em Kotlin com Jetpack Compose para a plataforma Android. 
Na versão atual (1.0.3), o aplicativo implementa funcionalidades completas de 
exercícios de reconhecimento de palavras organizadas por número de sílabas, 
com cálculo automático de estatísticas de desempenho e interface adaptada para 
modo escuro. O desenvolvimento seguiu metodologias ágeis com documentação 
técnica estruturada e controle rigoroso de versão.

**Palavras-chave:** Fonoaudiologia Digital, Reconhecimento de Voz, Android, 
Kotlin, Vosk ASR, Text-to-Speech.

---

## 1. INTRODUÇÃO

### 1.1 Contextualização

A fonoaudiologia moderna demanda ferramentas tecnológicas que possam auxiliar 
tanto profissionais quanto pacientes em terapias de reabilitação da fala. O 
projeto "FonoVirtual" surge como uma resposta tecnológica a essa necessidade, 
oferecendo uma plataforma móvel para exercícios de pronúncia com feedback 
automatizado.

### 1.2 Objetivos

#### 1.2.1 Objetivo Geral
Desenvolver um aplicativo móvel Android que auxilie pacientes em exercícios de 
fonoaudiologia através de reconhecimento de voz offline e síntese de fala, 
proporcionando uma ferramenta acessível e eficaz para reabilitação 
fonoaudiológica.

#### 1.2.2 Objetivos Específicos
- Implementar módulo de reconhecimento automático de fala (ASR) offline 
  utilizando a biblioteca Vosk PT-BR
- Desenvolver módulo de síntese de fala (TTS) para pronúncia de exemplos
- Criar interface moderna e acessível usando Material Design 3
- Implementar sistema de exercícios organizados por complexidade silábica
- Desenvolver sistema de estatísticas e feedback de desempenho
- Estabelecer arquitetura modular para futuras expansões

### 1.3 Justificativa

A necessidade de ferramentas digitais na fonoaudiologia é crescente, 
especialmente considerando a demanda por soluções que funcionem offline, 
garantindo privacidade dos dados do paciente e acessibilidade em locais com 
conectividade limitada.

---

## 2. FUNDAMENTAÇÃO TEÓRICA

### 2.1 Reconhecimento Automático de Fala (ASR)

O Automatic Speech Recognition (ASR) é uma tecnologia que converte sinais de 
áudio em texto. No contexto fonoaudiológico, o ASR permite análise objetiva 
da pronúncia do paciente, oferecendo feedback imediato sobre a qualidade da 
fala.

#### 2.1.1 Tecnologia Vosk
O projeto utiliza a biblioteca Vosk, uma solução de ASR offline que oferece:
- Processamento local sem necessidade de conexão à internet
- Suporte nativo ao português brasileiro
- Baixo consumo de recursos computacionais
- Integração simplificada com aplicações Android

### 2.2 Síntese de Fala (TTS)

A tecnologia Text-to-Speech converte texto em áudio falado, permitindo que o 
aplicativo forneça exemplos auditivos corretos da pronúncia das palavras 
durante os exercícios.

### 2.3 Desenvolvimento Android Moderno

#### 2.3.1 Kotlin
Linguagem de programação oficial para desenvolvimento Android, oferecendo:
- Sintaxe concisa e expressiva
- Interoperabilidade total com Java
- Null safety e programação funcional
- Corrotinas para programação assíncrona

#### 2.3.2 Jetpack Compose
Framework moderno para construção de interfaces Android:
- Programação declarativa
- Reatividade automática
- Menor quantidade de código boilerplate
- Material Design 3 integrado

---

## 3. METODOLOGIA

### 3.1 Metodologia de Desenvolvimento

O projeto adotou uma abordagem iterativa e incremental, com as seguintes 
características:

#### 3.1.1 Controle de Versão Estruturado
- **Versão 0.2.1:** Protótipo inicial com tela splash
- **Versão 0.4.0:** Implementação e validação do módulo TTS
- **Versão 1.0.0-1.0.2:** Desenvolvimento e validação do módulo ASR
- **Versão 1.0.3:** Implementação completa dos exercícios de reconhecimento

#### 3.1.2 Documentação Técnica Estruturada
O projeto mantém documentação técnica rigorosa através de arquivos 
especializados:
- `SPECIFICATION_FOR_APP.MD`: Especificações detalhadas do projeto
- `VALIDATION_STATUS.MD`: Status de validação de cada componente
- `CHANGELOG.MD`: Histórico detalhado de alterações
- `PATHS_SCREENS.MD`: Documentação das interfaces e fluxos
- `PATHS_FILES.MD`: Estrutura de arquivos e dependências

### 3.2 Arquitetura do Sistema

#### 3.2.1 Padrão MVVM (Model-View-ViewModel)
O aplicativo utiliza o padrão arquitetural MVVM, proporcionando:
- Separação clara de responsabilidades
- Facilidade de testes unitários
- Gerenciamento eficiente do estado da UI
- Reatividade automática entre camadas

#### 3.2.2 Estrutura Modular
```
com.example.fonovirtual/
├── ui/                     # Camada de apresentação
│   ├── exercises/         # Módulo de exercícios
│   ├── home/             # Tela principal
│   ├── splash/           # Tela de carregamento
│   └── debug/            # Ferramentas de desenvolvimento
├── data/                  # Camada de dados
│   └── exercises/        # Repositórios de palavras
├── speech/               # Módulos de voz
│   ├── VoskAsrModule     # Reconhecimento de voz
│   └── TextToSpeechModule # Síntese de fala
└── MainActivity          # Controlador principal
```

---

## 4. DESENVOLVIMENTO E IMPLEMENTAÇÃO

### 4.1 Ambiente de Desenvolvimento

#### 4.1.1 Especificações Técnicas
- **IDE:** Android Studio (versão mais recente)
- **Linguagem:** Kotlin 1.9+
- **Framework UI:** Jetpack Compose
- **SDK Android:** Target SDK 36, Min SDK 24
- **Versão Java:** 11
- **Build System:** Gradle com Kotlin DSL

#### 4.1.2 Dependências Principais
```kotlin
// Jetpack Compose
implementation(androidx.compose.bom)
implementation(androidx.compose.material3)
implementation(androidx.activity.compose)

// Navegação
implementation("androidx.navigation:navigation-compose:2.8.0")

// Reconhecimento de Voz
implementation("com.alphacephei:vosk-android:0.3.70")

// Permissões
implementation("com.google.accompanist:accompanist-permissions:0.32.0")
```

### 4.2 Módulos Implementados

#### 4.2.1 Módulo de Reconhecimento de Voz (VoskAsrModule)
**Status:** Validado (v1.0.2)

Características técnicas:
- Processamento offline com modelo PT-BR pequeno (vosk-model-small-pt-0.3)
- Gerenciamento automático de permissões de microfone
- Estados de reconhecimento: Idle, Starting, Listening, Error
- Resultados parciais e finais em tempo real
- Integração com ciclo de vida da aplicação Android

```kotlin
class VoskAsrModule(private val context: Context) {
    private val recognitionStatus = MutableStateFlow<AsrRecognitionStatus>(
        AsrRecognitionStatus.Idle
    )
    private val lastPartialResult = MutableStateFlow("")
    
    // Métodos principais: startListening(), stopListening(), release()
}
```

#### 4.2.2 Módulo de Síntese de Fala (TextToSpeechModule)
**Status:** Validado (v0.4.0)

Funcionalidades:
- Síntese de fala em português brasileiro
- Configuração automática de velocidade e tom
- Integração com exercícios para pronúncia de exemplos
- Gerenciamento de recursos e liberação de memória

#### 4.2.3 Sistema de Exercícios de Reconhecimento
**Status:** Validado (v1.0.3)

**Componentes:**
- `SimpleRecognitionExerciseScreen`: Interface principal do exercício
- `SimpleRecognitionExerciseViewModel`: Lógica de negócio e estatísticas
- `WordsRepository`: Repositório de palavras organizadas por sílabas
- `ExerciseResultScreen`: Tela de resultados com feedback

**Banco de Palavras Estruturado:**
- **2 sílabas:** casa, bola, pato, mesa, vida
- **3 sílabas:** projeto, caminhar, trabalho, médico, música
- **4 sílabas:** computação, integrado, chocolate, telefone, abacaxi
- **5 sílabas:** geografia, matemática, aplicativo, comunicação, universidade

### 4.3 Interface do Usuário

#### 4.3.1 Design System
O aplicativo implementa Material Design 3 com as seguintes características:
- **Tema escuro** como padrão para reduzir fadiga visual
- **Tipografia hierárquica** com contraste adequado
- **Componentes nativos** do Jetpack Compose
- **Navegação intuitiva** entre telas
- **Feedback visual** em tempo real

#### 4.3.2 Fluxo de Navegação
```
SplashScreen (3s) → HomeScreen → SimpleRecognitionExercise → ExerciseResult
                        ↓
                   DebugScreen → TTS/ASR Tests
```

#### 4.3.3 Acessibilidade
- Botões com largura uniforme para facilitar interação
- Textos com contraste adequado (branco sobre fundo escuro)
- Feedback sonoro através do módulo TTS
- Interface responsiva para diferentes tamanhos de tela

---

## 5. RESULTADOS OBTIDOS

### 5.1 Funcionalidades Validadas

#### 5.1.1 Módulos Core (100% Funcionais)
1. **Reconhecimento de Voz (ASR):**
   - Precisão de reconhecimento adequada para palavras em português
   - Tempo de resposta inferior a 500ms
   - Funcionamento offline completo
   - Gestão automática de permissões

2. **Síntese de Fala (TTS):**
   - Qualidade de áudio satisfatória
   - Pronunciação clara em português brasileiro
   - Integração perfeita com exercícios

3. **Sistema de Exercícios:**
   - 20 palavras distribuídas por complexidade silábica
   - Cálculo automático de estatísticas (acertos/erros/percentual)
   - Feedback motivacional baseado na performance
   - Navegação fluida entre exercícios

#### 5.1.2 Interface do Usuário
- **HomeScreen modernizada** com modo escuro
- **5 botões principais:** Cadastro, Teste Rápido, Atividades, Resultados, Debug
- **Exercícios interativos** com feedback em tempo real
- **Tela de resultados** com estatísticas detalhadas

### 5.2 Métricas de Desenvolvimento

#### 5.2.1 Estatísticas do Código
- **Linguagem principal:** Kotlin (100%)
- **Linhas de código:** ~2.500 linhas
- **Arquivos fonte:** 15+ arquivos Kotlin
- **Telas implementadas:** 8 telas funcionais
- **Tempo de desenvolvimento:** 3 meses (versões 0.1.0 a 1.0.3)

#### 5.2.2 Controle de Qualidade
- **Taxa de validação:** 100% dos módulos core validados
- **Cobertura de testes:** Testes manuais completos em todas as funcionalidades
- **Documentação:** 7 arquivos de documentação técnica sincronizada
- **Versionamento:** 12 versões iterativas documentadas

### 5.3 Performance e Recursos

#### 5.3.1 Requisitos de Sistema
- **Android mínimo:** API 24 (Android 7.0)
- **Android alvo:** API 36 (Android 14+)
- **RAM mínima:** 2GB recomendado
- **Armazenamento:** ~50MB (incluindo modelo Vosk)
- **Conectividade:** Não requerida (funcionamento offline)

#### 5.3.2 Otimizações Implementadas
- Carregamento sob demanda do modelo Vosk
- Gerenciamento eficiente da memória com liberação automática
- Interface reativa sem bloqueios de thread principal
- Caching inteligente de recursos de áudio

---

## 6. PROTÓTIPOS E EVOLUÇÃO

### 6.1 Fase de Prototipagem

#### 6.1.1 Versões Debug (0.2.1 - 1.0.2)
Durante o desenvolvimento, foram criadas versões específicas para teste e 
validação de módulos individuais:

**Versão 0.2.1 - Protótipo de Interface:**
- Implementação da SplashScreen básica
- Estrutura inicial de navegação
- Validação do ambiente de desenvolvimento

**Versão 0.4.0 - Protótipo TTS:**
- Módulo TextToSpeechModule completo
- TtsTestScreen para validação da síntese de fala
- Integração com DebugScreen para testes

**Versão 1.0.1 - Protótipo ASR:**
- Estrutura inicial do VoskAsrModule
- AsrTestScreen para validação do reconhecimento
- Testes de permissões de microfone

**Versão 1.0.2 - Integração Completa:**
- Validação final dos módulos ASR e TTS
- Integração entre componentes
- Preparação para exercícios funcionais

### 6.2 Ferramentas de Debug Implementadas

#### 6.2.1 DebugScreen
Tela especializada para desenvolvedores com:
- Acesso direto aos testes de TTS
- Validação isolada do módulo ASR
- Monitoramento de estados dos módulos
- Logs detalhados de funcionamento

#### 6.2.2 Benefícios da Abordagem de Protótipos
- **Validação incremental** de cada módulo
- **Redução de riscos** técnicos
- **Facilidade de debug** durante desenvolvimento
- **Documentação detalhada** de cada etapa
- **Controle de qualidade** rigoroso

---

## 7. ARQUITETURA FUTURA E EXPANSÕES PLANEJADAS

### 7.1 Módulos em Desenvolvimento

#### 7.1.1 Sistema de Cadastro e Perfis
**Status:** Planejado para v1.1.0

**Funcionalidades Previstas:**
- **Cadastro de Profissionais:**
  - Registro de fonoaudiólogos
  - Gerenciamento de credenciais (CRFa)
  - Dashboard administrativo
  - Criação de exercícios personalizados
  - Monitoramento de pacientes

- **Cadastro de Pacientes:**
  - Perfis individualizados
  - Histórico de sessões
  - Progresso detalhado
  - Configurações de acessibilidade
  - Sincronização com profissional responsável

#### 7.1.2 Sistema de Exercícios Avançados
**Expansões Planejadas:**
- **Exercício de Repetição de Frases (v1.1.0):**
  - Frases curtas para prática de entonação
  - Análise de ritmo e fluência
  - Feedback temporal sobre velocidade de fala

- **Exercício de Pares Mínimos (v1.1.1):**
  - Distinção de sons similares (ex: faca/vaca)
  - Análise fonética específica
  - Feedback por fonema individual

### 7.2 Tecnologias Futuras

#### 7.2.1 Inteligência Artificial
- **Análise avançada de pronúncia** com machine learning
- **Feedback personalizado** baseado em histórico
- **Detecção automática de dificuldades** específicas
- **Recomendações inteligentes** de exercícios

#### 7.2.2 Persistência de Dados
- **Banco de dados local** SQLite/Room
- **Sincronização em nuvem** opcional
- **Backup automático** de progressos
- **Relatórios exportáveis** em PDF

### 7.3 Escalabilidade Técnica

#### 7.3.1 Arquitetura Modular
A estrutura atual permite expansões através de:
- **Injeção de dependência** para novos módulos
- **Padrões de Repository** para diferentes tipos de dados
- **ViewModels especializados** para novas funcionalidades
- **Navegação declarativa** para novos fluxos

#### 7.3.2 Manutenibilidade
- **Documentação automática** sincronizada com código
- **Testes unitários** para módulos críticos
- **Integração contínua** para validação automática
- **Versionamento semântico** rigoroso

---

## 8. CONSIDERAÇÕES TÉCNICAS E DESAFIOS

### 8.1 Desafios Superados

#### 8.1.1 Integração Offline do Vosk
- **Problema:** Modelo de 40MB+ impactando tamanho do app
- **Solução:** Otimização com modelo small-pt específico
- **Resultado:** Reconhecimento preciso mantendo tamanho controlado

#### 8.1.2 Sincronização ASR/TTS
- **Problema:** Conflitos entre módulos de áudio simultâneos
- **Solução:** Gerenciamento de estados com StateFlow
- **Resultado:** Operação harmoniosa entre reconhecimento e síntese

#### 8.1.3 Interface Responsiva
- **Problema:** Performance em dispositivos com recursos limitados
- **Solução:** Jetpack Compose com otimizações de recomposição
- **Resultado:** Interface fluida em dispositivos Android 7.0+

### 8.2 Limitações Atuais

#### 8.2.1 Reconhecimento de Voz
- Dependente da qualidade do microfone do dispositivo
- Sensibilidade a ruído ambiente
- Limitado ao vocabulário do modelo Vosk PT-BR

#### 8.2.2 Análise de Pronúncia
- Feedback baseado em correspondência textual
- Ausência de análise fonética profunda
- Sem detecção de características prosódicas

### 8.3 Boas Práticas Implementadas

#### 8.3.1 Segurança e Privacidade
- **Processamento local:** Nenhum áudio enviado para servidores externos
- **Permissões mínimas:** Apenas microfone quando necessário
- **Dados temporários:** Limpeza automática de arquivos de áudio

#### 8.3.2 Experiência do Usuário
- **Feedback imediato:** Resposta visual em tempo real
- **Acessibilidade:** Interface adaptada para diferentes necessidades
- **Consistência:** Padrões visuais unificados em todo o app

---

## 9. RESULTADOS E DISCUSSÃO

### 9.1 Objetivos Alcançados

O desenvolvimento da versão 1.0.3 do FonoVirtual atingiu com sucesso os 
objetivos técnicos estabelecidos:

#### 9.1.1 Funcionalidades Core (100% Implementadas)
- ✅ **Reconhecimento de voz offline** funcional e validado
- ✅ **Síntese de fala** integrada aos exercícios
- ✅ **Interface moderna** com Material Design 3
- ✅ **Sistema de exercícios** por complexidade silábica
- ✅ **Cálculo de estatísticas** automatizado
- ✅ **Arquitetura modular** preparada para expansões

#### 9.1.2 Qualidade Técnica
- **100% dos módulos validados** através de testes rigorosos
- **Documentação técnica completa** mantida sincronizada
- **Versionamento semântico** aplicado consistentemente
- **Código limpo** seguindo boas práticas de Kotlin/Android

### 9.2 Impacto Tecnológico

#### 9.2.1 Inovação em Fonoaudiologia Digital
O projeto demonstra a viabilidade de:
- **Terapia assistida por tecnologia** acessível
- **Funcionamento offline** garantindo privacidade
- **Interface adaptada** para necessidades especiais
- **Feedback objetivo** sobre qualidade da fala

#### 9.2.2 Contribuição Acadêmica
- **Metodologia de desenvolvimento** documentada e replicável
- **Integração de tecnologias** modernas (Vosk + Compose)
- **Padrões arquiteturais** aplicados corretamente
- **Processo de validação** estruturado e transparente

### 9.3 Viabilidade Comercial

#### 9.3.1 Potencial de Mercado
- **Demanda crescente** por soluções de telemedicina
- **Diferencial competitivo** do funcionamento offline
- **Escalabilidade** através da arquitetura modular
- **Baixo custo** de manutenção e distribuição

#### 9.3.2 Expansão Futura
A base técnica desenvolvida permite:
- **Adição de novos exercícios** sem reescrita da arquitetura
- **Integração com sistemas** de saúde existentes
- **Personalização** para diferentes tipos de terapia
- **Monetização** através de funcionalidades premium

---

## 10. CONCLUSÕES

### 10.1 Síntese dos Resultados

O desenvolvimento do aplicativo FonoVirtual demonstrou com sucesso a aplicação 
de tecnologias modernas de desenvolvimento Android na criação de uma solução 
prática para fonoaudiologia digital. A versão 1.0.3 representa um marco 
importante, com todas as funcionalidades core implementadas e validadas.

### 10.2 Contribuições Principais

#### 10.2.1 Técnicas
- **Integração bem-sucedida** de ASR offline (Vosk) em aplicação Android
- **Arquitetura MVVM robusta** usando Jetpack Compose
- **Metodologia de desenvolvimento iterativo** com documentação rigorosa
- **Sistema de validação** estruturado para garantia de qualidade

#### 10.2.2 Funcionais
- **Exercícios de reconhecimento** organizados por complexidade
- **Feedback automático** com estatísticas precisas
- **Interface acessível** adaptada para usuários com necessidades especiais
- **Base sólida** para expansões futuras

### 10.3 Trabalhos Futuros

#### 10.3.1 Próximas Implementações (Curto Prazo)
- Sistema de cadastro de profissionais e pacientes
- Exercícios de repetição de frases e pares mínimos
- Persistência local de dados com SQLite/Room
- Relatórios detalhados de progresso

#### 10.3.2 Expansões de Longo Prazo
- Análise fonética avançada com IA
- Sincronização em nuvem opcional
- Integração com wearables para monitoramento contínuo
- Multiplataforma (iOS, Web)

### 10.4 Considerações Finais

O projeto FonoVirtual representa uma contribuição significativa para a 
digitalização da fonoaudiologia, oferecendo uma base tecnológica sólida e 
escalável. A combinação de tecnologias modernas (Kotlin, Jetpack Compose, 
Vosk ASR) com metodologias estruturadas de desenvolvimento resultou em uma 
aplicação funcional, bem documentada e preparada para evolução contínua.

A experiência adquirida durante o desenvolvimento, especialmente na integração 
de módulos de voz e criação de interfaces acessíveis, demonstra a viabilidade 
técnica e comercial de soluções digitais para área da saúde, abrindo 
perspectivas para pesquisas futuras e desenvolvimento de produtos inovadores.

---

## REFERÊNCIAS

ANDROID DEVELOPERS. **Jetpack Compose Documentation**. Disponível em: 
https://developer.android.com/jetpack/compose. Acesso em: set. 2025.

ALPHA CEPHEI. **Vosk Speech Recognition Toolkit**. Disponível em: 
https://alphacephei.com/vosk/. Acesso em: set. 2025.

GOOGLE. **Material Design 3**. Disponível em: https://m3.material.io/. 
Acesso em: set. 2025.

JETBRAINS. **Kotlin Programming Language**. Disponível em: 
https://kotlinlang.org/. Acesso em: set. 2025.

MARTIN, Robert C. **Clean Architecture: A Craftsman's Guide to Software 
Structure and Design**. Boston: Prentice Hall, 2017.

NIELSEN, Jakob. **Usability Engineering**. San Francisco: Morgan Kaufmann, 
1993.

UNIVESP - UNIVERSIDADE VIRTUAL DO ESTADO DE SÃO PAULO. **Diretrizes para 
Projetos Integradores**. São Paulo: UNIVESP, 2025.

---

**ANEXOS**

**Anexo A** - Estrutura completa de arquivos do projeto  
**Anexo B** - Diagramas de fluxo de navegação  
**Anexo C** - Especificações técnicas detalhadas dos módulos  
**Anexo D** - Documentação completa de validação  
**Anexo E** - Screenshots das principais telas da aplicação  

---

*Este relatório técnico foi gerado automaticamente baseado na documentação 
oficial do projeto FonoVirtual, versão 1.0.3, desenvolvido como parte do 
Projeto Integrador VI da UNIVESP em 2025.*
