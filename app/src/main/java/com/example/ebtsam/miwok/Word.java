package com.example.ebtsam.miwok;

public class Word {

   private String mDefaultLanguage;
   private String mMiwokLanguage;
   private int mImageSrcId=No_image_provided;
   private int mAudioSrcId;
   static int No_image_provided=-1;




    public  Word(String defaultLanguage,String miwokLanguage,int imageSrcId , int audioSrcId)
   {
       mDefaultLanguage=defaultLanguage;
       mMiwokLanguage=miwokLanguage;
       mImageSrcId=imageSrcId;
       mAudioSrcId=audioSrcId;
   }

    public Word(String defaultLanguage,String miwokLanguage,int audioSrcId)
    {
        mDefaultLanguage=defaultLanguage;
        mMiwokLanguage=miwokLanguage;
        mAudioSrcId=audioSrcId;

    }

    public String getmDefaultLanguage(){return mDefaultLanguage;}
    public String getmMiwokLanguage(){return mMiwokLanguage;}
    public int getmAudioSrcId(){return mAudioSrcId;}
    public int getmImageSrcId(){return mImageSrcId;}
    public boolean hasImage (){return mImageSrcId!=No_image_provided;}


}
