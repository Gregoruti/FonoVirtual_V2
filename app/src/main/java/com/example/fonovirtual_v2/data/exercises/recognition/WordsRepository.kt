package com.example.fonovirtual_v2.data.exercises.recognition

import com.example.fonovirtual_v2.ui.exercises.recognition.model.WordExercise

/**
 * Repositório de palavras fixas para exercícios de reconhecimento.
 * Mantém listas pré-definidas de palavras organizadas por número de sílabas
 * e por grupos de sons consonantais (Xr).
 *
 * @since 1.0.3
 * @updated 1.0.5 (30/09/2025) - Adicionados exercícios de sons Xr (BR, CR, FR, GR)
 * @validationStatus Em Desenvolvimento
 */
object WordsRepository {

    // Palavras organizadas por número de sílabas
    private val wordsBySyllables = mapOf(
        2 to listOf(
            WordExercise("casa", 2),
            WordExercise("bola", 2),
            WordExercise("pato", 2),
            WordExercise("mesa", 2),
            WordExercise("vida", 2)
        ),
        3 to listOf(
            WordExercise("projeto", 3),
            WordExercise("caminhar", 3),
            WordExercise("trabalho", 3),
            WordExercise("médico", 3),
            WordExercise("música", 3)
        ),
        4 to listOf(
            WordExercise("computação", 4),
            WordExercise("integrado", 4),
            WordExercise("chocolate", 4),
            WordExercise("telefone", 4),
            WordExercise("abacaxi", 4)
        ),
        5 to listOf(
            WordExercise("geografia", 5),
            WordExercise("matemática", 5),
            WordExercise("aplicativo", 5),
            WordExercise("comunicação", 5),
            WordExercise("universidade", 5)
        )
    )

    // Palavras organizadas por grupos de sons consonantais (Xr)
    private val wordsByConsonantGroups = mapOf(
        "BR" to listOf(
            WordExercise("brasil", 2),
            WordExercise("branco", 2),
            WordExercise("braço", 2),
            WordExercise("bravo", 2),
            WordExercise("biblioteca", 5)
        ),
        "CR" to listOf(
            WordExercise("criança", 3),
            WordExercise("criar", 2),
            WordExercise("cravo", 2),
            WordExercise("cristal", 2),
            WordExercise("crescer", 2)
        ),
        "FR" to listOf(
            WordExercise("fruta", 2),
            WordExercise("frio", 2),
            WordExercise("frase", 2),
            WordExercise("frango", 2),
            WordExercise("frequente", 3)
        ),
        "GR" to listOf(
            WordExercise("grande", 2),
            WordExercise("grupo", 2),
            WordExercise("grau", 1),
            WordExercise("grama", 2),
            WordExercise("gratidão", 3)
        )
    )

    /**
     * Retorna a lista de palavras para um determinado número de sílabas.
     *
     * @param syllableCount Número de sílabas desejado (2 a 5)
     * @return Lista de exercícios de palavras ou lista vazia se número de sílabas inválido
     */
    fun getWordsBySyllables(syllableCount: Int): List<WordExercise> {
        return wordsBySyllables[syllableCount] ?: emptyList()
    }

    /**
     * Retorna a lista de palavras para um determinado grupo consonantal.
     *
     * @param consonantGroup Grupo consonantal desejado (BR, CR, FR, GR)
     * @return Lista de exercícios de palavras ou lista vazia se grupo inválido
     */
    fun getWordsByConsonantGroup(consonantGroup: String): List<WordExercise> {
        return wordsByConsonantGroups[consonantGroup.uppercase()] ?: emptyList()
    }

    /**
     * Retorna a lista de contagens de sílabas disponíveis.
     *
     * @return Lista de números de sílabas (2, 3, 4, 5)
     */
    fun getAvailableSyllableCounts(): List<Int> {
        return wordsBySyllables.keys.sorted()
    }

    /**
     * Retorna a lista de grupos consonantais disponíveis.
     *
     * @return Lista de grupos consonantais (BR, CR, FR, GR)
     */
    fun getAvailableConsonantGroups(): List<String> {
        return wordsByConsonantGroups.keys.sorted()
    }
}
