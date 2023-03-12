package ex01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/** Содержит реализацию методов для вычисления и отображения результатов.
 * @author xone
 * @version 1.0
 */
public class Calc {
    /** Имя файла, используемое при сериализации. */
    private static final String FNAME = "ex01.Item2d.bin";
    /** Сохраняет результат вычислений. Объект класса {@linkplain Item2d} */
    private Item2d result;
    /** Инициализирует {@linkplain Calc#result} */
    public Calc() {
        result = new Item2d();
    }
    /** Установить значение {@linkplain Calc#result}
     * @param result - новое значение ссылки на объект {@linkplain Item2d}
     */
    public void setResult(Item2d result) {
        this.result = result;
    }
    /** Получить значение {@linkplain Calc#result}
     * @return текущее значение ссылки на объект {@linkplain Item2d}
     */
    public Item2d getResult() {
        return result;
    }
    /**
     * Вычисляет значение функции.
     *
     * @param decimalNumber - аргумент вычисляемой функции.
     * @return результат вычисления функции.
     */
    private Item2d calc(double decimalNumber) {
        String binaryDigits = Integer.toBinaryString((int) decimalNumber);
        int tetradsCount = 0;
        if (binaryDigits.length() % 4 == 0) {
            tetradsCount = binaryDigits.length() / 4;
        } else {
            tetradsCount = binaryDigits.length() / 4 + 1;
        }
        return new Item2d((int) decimalNumber, tetradsCount);
    }
    /** Вычисляет значение функции и сохраняет
     * результат в объекте {@linkplain Calc#result}
     * @param decimalNumber - аргумент вычисляемой функции.
     */
    public void init(double decimalNumber) {
        setResult(calc(decimalNumber));
    }
    /** Выводит результат вычислений. */
    public void show() {
        System.out.println(result);
    }
    /** Сохраняет {@linkplain Calc#result} в файле {@linkplain Calc#FNAME}
     * @throws IOException
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new
                FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }
    /** Восстанавливает {@linkplain Calc#result} из файла {@linkplain Calc#FNAME}
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2d)is.readObject();
        is.close();
    }
}