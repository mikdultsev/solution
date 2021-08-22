public class AbstractFactoryLesson {
    public static void main(String[] args) {
        Factory DevFactory = new AbstractFactory().createFactory("Dev");
        Factory QAFactory = new AbstractFactory().createFactory("QA");
        Dev js = DevFactory.createDev("JS");
        Dev java = DevFactory.createDev("Java");
        js.interview();
        java.interview();
        QA manual = QAFactory.createQA("QAManual");
        QA automation = QAFactory.createQA("QAAutomation");
        manual.interview();
        automation.interview();
    }
}

interface Dev {
    void interview();
}
class JS implements Dev {
    @Override
    public void interview() {
        System.out.println("test JS");
    }
}
class Java implements Dev{
    @Override
    public void interview() {
        System.out.println("test Java");
    }
}
class DevFactory implements Factory {
    public Dev createDev (String typeOfDev){
        switch (typeOfDev){
            case "JS": return new JS();
            case "Java": return new Java();
            default: return null;
        }
    }

    @Override
    public QA createQA(String typeOfQA) {
        return null;
    }
}

interface QA {
    void interview();
}
class QAManual implements QA {
    @Override
    public void interview() {
        System.out.println("test QAManual");
    }
}
class QAAutomation implements QA{
    @Override
    public void interview() {
        System.out.println("test QAAutomation");
    }
}
class QAFactory implements Factory{
    public QA createQA (String typeOfQA){
        switch (typeOfQA){
            case "QAManual": return new QAManual();
            case "QAAutomation": return new QAAutomation();
            default: return null;
        }
    }

    @Override
    public Dev createDev(String typeOfDev) {
        return null;
    }
}

interface Factory{
    QA createQA(String typeOfQA);
    Dev createDev(String typeOfDev);
}
class AbstractFactory{
    Factory createFactory(String typeOfFactory){
        switch(typeOfFactory){
            case "Dev": return new DevFactory();
            case "QA": return new QAFactory();
            default: return null;
        }
    }
}
