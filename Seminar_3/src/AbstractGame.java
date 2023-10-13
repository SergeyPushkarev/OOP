import java.util.*;

public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer maxTry;
    String computerWord;
    ArrayList<String> history;
    static GameStatus gameStatus;

    abstract ArrayList<String> generateCharList();

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        gameStatus = GameStatus.START;
        history = new ArrayList<>();
        System.out.println("Загаданный компьютером набор символов - " + computerWord);
    }

    private String generateWord() {
        List<String> alphabet = generateCharList();
        Random random = new Random();
        String res = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(alphabet.size());
            res += alphabet.get(randomIndex);
            alphabet.remove(randomIndex);
        }
        return res;
    }

    @Override
    public Answer inputValue(String value) {
        switch (value){
            case "res":
                System.out.println("Вы решили перезапустить игру");
                gameStatus = GameStatus.STOP;
                history.clear();
                menu();
                break;
            case "his":
                System.out.println("Вы решили просмотреть историю сделанных ходов");
                for (String item : history) {
                    System.out.println(item);
                }
                break;
            case "exit":
                System.out.println("Вы решили закончить игру! Всего доброго!");
                gameStatus = GameStatus.STOP;
                history.clear();
                break;
            default:
                history.add(value);
                int bull = 0;
                int cow = 0;
                for (int i = 0; i < value.length(); i++) {
                    if (value.charAt(i) == computerWord.charAt(i)) {
                        bull++;
                    } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                        cow++;
                    }
                }
                if (bull == computerWord.length()) {
                    gameStatus = GameStatus.WIN;
                }
                maxTry--;
                if (maxTry == 0 && gameStatus != GameStatus.WIN) {
                    gameStatus = GameStatus.LOSE;
                }
                return new Answer(bull, cow, maxTry);

        }
        return null;
    }

    public static void init() {
        gameStatus = GameStatus.INIT;
        menu();
    }
    public static void menu() {

        Scanner scan = new Scanner(System.in);
        System.out.println("[МЕНЮ ИГРЫ БЫКИ И КОРОВЫ]  \n" +
                "Введите цифру для выбора раскладки или выхода: \n" +
                "1. Раскладка с цифрами \n" +
                "2. Раскладка с русским алфавитом \n" +
                "3. Раскладка с английским алфавитом \n" +
                "4. Выход из игры");

        int numAction = scan.nextInt();
        int sizeWord = 0;
        int maxTry = 0;
        switch (numAction) {
            case 1:
                System.out.println("Введите количество цифр в угадываемом слове:");
                sizeWord = scan.nextInt();
                System.out.println("Введите количество попыток:");
                maxTry = scan.nextInt();

                runningGame(sizeWord, maxTry, new NumberGame());
                break;
            case 2,3:
                System.out.println("Введите количество букв в угадываемом слове:");
                sizeWord = scan.nextInt();
                System.out.println("Введите количество попыток:");
                maxTry = scan.nextInt();

                if(numAction == 2) { runningGame(sizeWord, maxTry, new RUAlphabetGame());
                } else { runningGame(sizeWord, maxTry, new ENAlphabetGame()); }
                break;
            case 4:
                System.out.println("Всего доброго!");
                break;

            default:
                System.out.println("Ошибка! Введите цифру среди предложенных в меню!");
                break;
        }
        scan.close();
    }

    public static void runningGame(Integer sizeWord, Integer maxTry, Game game) {
        game.start(sizeWord,maxTry);

        while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE &&
                game.getGameStatus() != GameStatus.STOP) {
            Scanner scanner = new Scanner(System.in);
            Answer answer = game.inputValue(scanner.nextLine());
            if(answer!=null){
                System.out.println(answer + "\n" +
                        "(Доступные команды:" +
                        "res - перезапуск игры," +
                        "his - просмотр истории ходов," +
                        "exit - выход из игры)");
            }
        }
        System.out.println("Статус игры: " + game.getGameStatus());
        if(game.getGameStatus() == GameStatus.WIN || game.getGameStatus() == GameStatus.LOSE) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Желаете сыграть еще? Наберите - yes");
            String text = sc.nextLine();
            if(text.equals("yes")){
                menu();
            } else {
                System.out.println("Всего доброго!");
            }
        }
    }
    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}