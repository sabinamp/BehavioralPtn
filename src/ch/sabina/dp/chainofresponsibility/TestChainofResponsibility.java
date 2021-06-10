package ch.sabina.dp.chainofresponsibility;

public class TestChainofResponsibility {
    public void chain(){
        Fileh file = null;
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");

        textHandler.setHandler(audioHandler);
        file = new Fileh("Abc.mp3", "audio", "C:");
        textHandler.process(file);
    }
}
