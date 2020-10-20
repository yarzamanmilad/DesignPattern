public abstract class MediaConverterAbstractFactory {
    public static MediaFactory createFactory(MediaTypes mediaTypes){
        MediaFactory mediaFactory=null;
             switch (mediaTypes){
                 case IMAGE:mediaFactory=new ImageFactory();break;
                 case MUSIC:mediaFactory=new MusicFactory();break;
                 case VIDEO:mediaFactory=new VideoFactory();break;
             }
             return mediaFactory;
    }
    enum MediaTypes{
        IMAGE,VIDEO
        ,MUSIC
    }
}
