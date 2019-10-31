package creational;

public class FactoryPattern {
    public static void main(String[] args) {
        Commander commander = ProvideFactory.getDeveloper(FactoryType.CODER, "Principle");
        System.out.println(commander.getInfo());
        System.out.println(commander.doItYourJob());

        Commander commander2 = ProvideFactory.getDeveloper(FactoryType.DESINGER, "Expert");
        System.out.println(commander2.getInfo());
        System.out.println(commander2.doItYourJob());

    }
}

interface Commander {
    String getInfo();

    String doItYourJob();
}

enum FactoryType {
    DESINGER, CODER
}

class ProvideFactory {
    static Commander getDeveloper(FactoryType factoryType, String title) {
        if (factoryType.equals(FactoryType.CODER)) return new SoftwareDeveloper(title);
        else return new GraphicDesigner(title);
    }
}


class SoftwareDeveloper implements Commander {
    String title;

    public SoftwareDeveloper(String title) {
        this.title = title;
    }

    @Override
    public String getInfo() {
        return title + " Software developer provide various write programing language";
    }

    @Override
    public String doItYourJob() {
        return "Develop your code";
    }
}

class GraphicDesigner implements Commander {
    String title;

    public GraphicDesigner(String title) {
        this.title = title;
    }


    @Override
    public String getInfo() {
        return title + " Grafic designer improve user interface";
    }

    @Override
    public String doItYourJob() {
        return "Make good design";
    }
}