//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg

import "errors"

type AiChooseSkill struct {
    Id int32
    NodeName string
    Decorators []interface{}
    Services []interface{}
    IgnoreRestartSelf bool
    TargetActorKey string
    ResultSkillIdKey string
}

const TypeId_AiChooseSkill = -918812268

func (*AiChooseSkill) GetTypeId() int32 {
    return -918812268
}

func (_v *AiChooseSkill)Deserialize(_buf map[string]interface{}) (err error) {
    { var _ok_ bool; var _tempNum_ float64; if _tempNum_, _ok_ = _buf["id"].(float64); !_ok_ { err = errors.New("id error"); return }; _v.Id = int32(_tempNum_) }
    { var _ok_ bool; if _v.NodeName, _ok_ = _buf["node_name"].(string); !_ok_ { err = errors.New("node_name error"); return } }
     {
                var _arr_ []interface{}
                var _ok_ bool
                if _arr_, _ok_ = _buf["decorators"].([]interface{}); !_ok_ { err = errors.New("decorators error"); return }

                _v.Decorators = make([]interface{}, 0, len(_arr_))
                
                for _, _e_ := range _arr_ {
                    var _list_v_ interface{}
                    { var _ok_ bool; var _x_ map[string]interface{}; if _x_, _ok_ = _e_.(map[string]interface{}); !_ok_ { err = errors.New("_list_v_ error"); return }; if _list_v_, err = DeserializeAiDecorator(_x_); err != nil { return } }
                    _v.Decorators = append(_v.Decorators, _list_v_)
                }
            }

     {
                var _arr_ []interface{}
                var _ok_ bool
                if _arr_, _ok_ = _buf["services"].([]interface{}); !_ok_ { err = errors.New("services error"); return }

                _v.Services = make([]interface{}, 0, len(_arr_))
                
                for _, _e_ := range _arr_ {
                    var _list_v_ interface{}
                    { var _ok_ bool; var _x_ map[string]interface{}; if _x_, _ok_ = _e_.(map[string]interface{}); !_ok_ { err = errors.New("_list_v_ error"); return }; if _list_v_, err = DeserializeAiService(_x_); err != nil { return } }
                    _v.Services = append(_v.Services, _list_v_)
                }
            }

    { var _ok_ bool; if _v.IgnoreRestartSelf, _ok_ = _buf["ignore_restart_self"].(bool); !_ok_ { err = errors.New("ignore_restart_self error"); return } }
    { var _ok_ bool; if _v.TargetActorKey, _ok_ = _buf["target_actor_key"].(string); !_ok_ { err = errors.New("target_actor_key error"); return } }
    { var _ok_ bool; if _v.ResultSkillIdKey, _ok_ = _buf["result_skill_id_key"].(string); !_ok_ { err = errors.New("result_skill_id_key error"); return } }
    return
}

func DeserializeAiChooseSkill(_buf map[string]interface{}) (*AiChooseSkill, error) {
    v := &AiChooseSkill{}
    if err := v.Deserialize(_buf); err == nil {
        return v, nil
    } else {
        return nil, err
    }
}
