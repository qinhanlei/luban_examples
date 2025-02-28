
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.ai;

import bright.serialization.*;



public final class ChooseSkill extends cfg.ai.Task {
    public ChooseSkill(ByteBuf _buf) { 
        super(_buf);
        targetActorKey = _buf.readString();
        resultSkillIdKey = _buf.readString();
    }

    public ChooseSkill(int id, String node_name, java.util.ArrayList<cfg.ai.Decorator> decorators, java.util.ArrayList<cfg.ai.Service> services, boolean ignore_restart_self, String target_actor_key, String result_skill_id_key ) {
        super(id, node_name, decorators, services, ignore_restart_self);
        this.targetActorKey = target_actor_key;
        this.resultSkillIdKey = result_skill_id_key;
    }


    public final String targetActorKey;
    public final String resultSkillIdKey;

    public static final int __ID__ = -918812268;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "decorators:" + decorators + ","
        + "services:" + services + ","
        + "ignoreRestartSelf:" + ignoreRestartSelf + ","
        + "targetActorKey:" + targetActorKey + ","
        + "resultSkillIdKey:" + resultSkillIdKey + ","
        + "}";
    }
}
