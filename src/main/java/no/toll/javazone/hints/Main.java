package no.toll.javazone.hints;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final String[] what = new String[] {
                javaWasOriginallyDevelopedByThisPersonAtSunMicrosystems(),
                nonBlockingCompletableFutureAndAjaxAreKeywordsThatDescribesAProgrammingParadigm(),
                aPieceOfMemoryThatCanContainADataValue(),
                sheHasBeenCreditedAsTheFirstComputerProgrammer(),
                aNumberThatIsActuallyNothingWrittenAsAWord(),
                simulaDevelopedInNorwayInThe1960IsConsideredTheFirstProgrammingLanguageOfThisParadigm(),
                aLightweightHighPerformanceJavaScriptRuntimeOnTheJvmAndAlsoSharingItsNameWithAnAnimal(),
                anEventThatOccursDuringTheExecutionOfAProgramThatDisruptsTheNormalFlowOfInstructions()
        };
        final String solution =
                Arrays.stream(what).map(s -> s.substring(0, 1)).collect(Collectors.joining())
                      .concat(" ")
                      .concat(theYearJavaSe18WasReleased());
        System.out.println(solution);
    }

    private static String javaWasOriginallyDevelopedByThisPersonAtSunMicrosystems() {
        return "James Gosling";
    }

    private static String nonBlockingCompletableFutureAndAjaxAreKeywordsThatDescribesAProgrammingParadigm() {
        return "asynchronous programming";
    }

    private static String aPieceOfMemoryThatCanContainADataValue() {
        return "variable";
    }

    private static String sheHasBeenCreditedAsTheFirstComputerProgrammer() {
        return "Ada Lovelace".toLowerCase();
    }

    private static String aNumberThatIsActuallyNothingWrittenAsAWord() {
        return "zero".toUpperCase();
    }

    private static String simulaDevelopedInNorwayInThe1960IsConsideredTheFirstProgrammingLanguageOfThisParadigm() {
        return "object-oriented programming";
    }

    private static String aLightweightHighPerformanceJavaScriptRuntimeOnTheJvmAndAlsoSharingItsNameWithAnAnimal() {
        return "Nashorn".toLowerCase();
    }

    private static String anEventThatOccursDuringTheExecutionOfAProgramThatDisruptsTheNormalFlowOfInstructions() {
        return "exception";
    }

    private static String theYearJavaSe18WasReleased() {
        return "2022";
    }
}
