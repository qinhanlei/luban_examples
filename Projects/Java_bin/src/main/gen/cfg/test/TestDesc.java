
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;



public final class TestDesc {
    public TestDesc(ByteBuf _buf) { 
        id = _buf.readInt();
        name = _buf.readString();
        a1 = _buf.readInt();
        a2 = _buf.readInt();
        x1 = new cfg.test.H1(_buf);
        {int n = Math.min(_buf.readSize(), _buf.size());x2 = new java.util.ArrayList<cfg.test.H2>(n);for(int i = 0 ; i < n ; i++) { cfg.test.H2 _e;  _e = new cfg.test.H2(_buf); x2.add(_e);}}
        {int n = Math.min(_buf.readSize(), _buf.size());x3 = new cfg.test.H2[n];for(int i = 0 ; i < n ; i++) { cfg.test.H2 _e;_e = new cfg.test.H2(_buf); x3[i] = _e;}}
    }

    public TestDesc(int id, String name, int a1, int a2, cfg.test.H1 x1, java.util.ArrayList<cfg.test.H2> x2, cfg.test.H2[] x3 ) {
        this.id = id;
        this.name = name;
        this.a1 = a1;
        this.a2 = a2;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }


    public final int id;
    /**
     * 禁止
     */
    public final String name;
    /**
     * 测试换行<br/>第2行<br/>第3层
     */
    public final int a1;
    /**
     * 测试转义 &lt; &amp; % / # &gt;
     */
    public final int a2;
    public final cfg.test.H1 x1;
    /**
     * 这是x2
     */
    public final java.util.ArrayList<cfg.test.H2> x2;
    public final cfg.test.H2[] x3;


    public void resolve(java.util.HashMap<String, Object> _tables) {
        if (x1 != null) {x1.resolve(_tables);}
        for(cfg.test.H2 _e : x2) { if (_e != null) _e.resolve(_tables); }
        for(cfg.test.H2 _e : x3) { if (_e != null) _e.resolve(_tables); }
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "name:" + name + ","
        + "a1:" + a1 + ","
        + "a2:" + a2 + ","
        + "x1:" + x1 + ","
        + "x2:" + x2 + ","
        + "x3:" + x3 + ","
        + "}";
    }
}
