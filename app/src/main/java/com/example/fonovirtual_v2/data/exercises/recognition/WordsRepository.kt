package com.example.fonovirtual_v2.data.exercises.recognition

import com.example.fonovirtual_v2.ui.exercises.recognition.model.WordExercise

/**
 * Repositório de palavras fixas para exercícios de reconhecimento.
 * Mantém listas pré-definidas de palavras organizadas por número de sílabas.
 *
 * @since 1.0.3
 * @validationStatus Em Desenvolvimento
 */
object WordsRepository {

    // Palavras organizadas por número de sílabas
    private val words = mapOf(
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

    /**
     * Retorna a lista de palavras para um determinado número de sílabas.
     *
     * @param syllableCount Número de sílabas desejado (2 a 5)
     * @return Lista de exercícios de palavras ou lista vazia se número de sílabas inválido
     */
    fun getWordsForSyllableCount(syllableCount: Int): List<WordExercise> {
        return words[syllableCount] ?: emptyList()
    }

    /**
     * Retorna todos os números de sílabas disponíveis.
     *
     * @return Lista ordenada de números de sílabas disponíveis
     */
    fun getAvailableSyllableCounts(): List<Int> {
        return words.keys.sorted()
    }
}
