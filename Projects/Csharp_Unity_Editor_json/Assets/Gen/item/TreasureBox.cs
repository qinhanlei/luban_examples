//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
using Bright.Serialization;
using System.Collections.Generic;
using SimpleJSON;



namespace editor.cfg.item
{

public sealed partial class TreasureBox :  item.ItemExtra 
{
    public TreasureBox()
    {
            OpenLevel = new condition.MinLevel();
            DropIds = new System.Collections.Generic.List<int>();
            ChooseList = new System.Collections.Generic.List<item.ChooseOneBonus>();
    }

    public override void LoadJson(SimpleJSON.JSONObject _json)
    {
        { 
            var _fieldJson = _json["id"];
            if (_fieldJson != null)
            {
                if(!_fieldJson.IsNumber) { throw new SerializationException(); }  Id = _fieldJson;
            }
        }
        
        { 
            var _fieldJson = _json["key_item_id"];
            if (_fieldJson != null)
            {
                if(!_fieldJson.IsNumber) { throw new SerializationException(); }  KeyItemId = _fieldJson;
            }
        }
        
        { 
            var _fieldJson = _json["open_level"];
            if (_fieldJson != null)
            {
                if(!_fieldJson.IsObject) { throw new SerializationException(); }  OpenLevel = condition.MinLevel.LoadJsonMinLevel(_fieldJson);
            }
        }
        
        { 
            var _fieldJson = _json["use_on_obtain"];
            if (_fieldJson != null)
            {
                if(!_fieldJson.IsBoolean) { throw new SerializationException(); }  UseOnObtain = _fieldJson;
            }
        }
        
        { 
            var _fieldJson = _json["drop_ids"];
            if (_fieldJson != null)
            {
                if(!_fieldJson.IsArray) { throw new SerializationException(); } DropIds = new System.Collections.Generic.List<int>(); foreach(JSONNode __e in _fieldJson.Children) { int __v;  if(!__e.IsNumber) { throw new SerializationException(); }  __v = __e;  DropIds.Add(__v); }  
            }
        }
        
        { 
            var _fieldJson = _json["choose_list"];
            if (_fieldJson != null)
            {
                if(!_fieldJson.IsArray) { throw new SerializationException(); } ChooseList = new System.Collections.Generic.List<item.ChooseOneBonus>(); foreach(JSONNode __e in _fieldJson.Children) { item.ChooseOneBonus __v;  if(!__e.IsObject) { throw new SerializationException(); }  __v = item.ChooseOneBonus.LoadJsonChooseOneBonus(__e);  ChooseList.Add(__v); }  
            }
        }
        
    }

    public override void SaveJson(SimpleJSON.JSONObject _json)
    {
        _json["$type"] = "item.TreasureBox";
        {
            _json["id"] = new JSONNumber(Id);
        }

        if (KeyItemId != null)
        {
            _json["key_item_id"] = new JSONNumber(KeyItemId.Value);
        }
        {

            if (OpenLevel == null) { throw new System.ArgumentNullException(); }
            { var __bjson = new JSONObject();  condition.MinLevel.SaveJsonMinLevel(OpenLevel, __bjson); _json["open_level"] = __bjson; }
        }
        {
            _json["use_on_obtain"] = new JSONBool(UseOnObtain);
        }
        {

            if (DropIds == null) { throw new System.ArgumentNullException(); }
            { var __cjson = new JSONArray(); foreach(var _e in DropIds) { __cjson["null"] = new JSONNumber(_e); } _json["drop_ids"] = __cjson; }
        }
        {

            if (ChooseList == null) { throw new System.ArgumentNullException(); }
            { var __cjson = new JSONArray(); foreach(var _e in ChooseList) { { var __bjson = new JSONObject();  item.ChooseOneBonus.SaveJsonChooseOneBonus(_e, __bjson); __cjson["null"] = __bjson; } } _json["choose_list"] = __cjson; }
        }
    }

    public static TreasureBox LoadJsonTreasureBox(SimpleJSON.JSONNode _json)
    {
        TreasureBox obj = new item.TreasureBox();
        obj.LoadJson((SimpleJSON.JSONObject)_json);
        return obj;
    }
        
    public static void SaveJsonTreasureBox(TreasureBox _obj, SimpleJSON.JSONNode _json)
    {
        _obj.SaveJson((SimpleJSON.JSONObject)_json);
    }

    public int? KeyItemId { get; set; }

    public condition.MinLevel OpenLevel { get; set; }

    public bool UseOnObtain { get; set; }

    public System.Collections.Generic.List<int> DropIds { get; set; }

    public System.Collections.Generic.List<item.ChooseOneBonus> ChooseList { get; set; }

}
}
