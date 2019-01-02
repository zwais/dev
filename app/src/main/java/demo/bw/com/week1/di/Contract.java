package demo.bw.com.week1.di;

public interface Contract {
    //展示
    void showview(String s);

    //presenter
    public interface Presenter<iview>{
        //关联
      void attachview();
      //解除
      void dataview();
      //方法
     void responsedata();

    }
    //module
    public interface IMoudle{
        //接口回调
       interface callister{

        }
    }
}
