package Practice22.ex1.ex3;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen() {
        return new MusicDocument();
    }
}