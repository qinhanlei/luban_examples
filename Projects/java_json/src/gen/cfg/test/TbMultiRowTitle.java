//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import com.google.gson.JsonElement;


public final class TbMultiRowTitle {
    private final java.util.HashMap<Integer, cfg.test.MultiRowTitle> _dataMap;
    private final java.util.ArrayList<cfg.test.MultiRowTitle> _dataList;
    
    public TbMultiRowTitle(JsonElement __json__) {
        _dataMap = new java.util.HashMap<Integer, cfg.test.MultiRowTitle>();
        _dataList = new java.util.ArrayList<cfg.test.MultiRowTitle>();
        
        for(com.google.gson.JsonElement _e_ : __json__.getAsJsonArray()) {
            cfg.test.MultiRowTitle _v;
            _v = new cfg.test.MultiRowTitle(_e_.getAsJsonObject());
            _dataList.add(_v);
            _dataMap.put(_v.id, _v);
        }
    }

    public java.util.HashMap<Integer, cfg.test.MultiRowTitle> getDataMap() { return _dataMap; }
    public java.util.ArrayList<cfg.test.MultiRowTitle> getDataList() { return _dataList; }

    public cfg.test.MultiRowTitle get(int key) { return _dataMap.get(key); }

    public void resolve(java.util.HashMap<String, Object> _tables) {
        for(cfg.test.MultiRowTitle v : _dataList) {
            v.resolve(_tables);
        }
    }

}