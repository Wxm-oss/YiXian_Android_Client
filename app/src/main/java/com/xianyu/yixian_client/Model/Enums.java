package com.xianyu.yixian_client.Model;

/**
 * @ProjectName: YiXian
 * @Package: com.xianyu.yixian.Model
 * @ClassName: Enums
 * @Description: java类作用描述
 * @Author: Jianxian
 * @CreateDate: 2020/11/23 19:37
 * @UpdateUser: Jianxian
 * @UpdateDate: 2020/11/23 19:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Enums {
    public enum Room_Type { Solo,Team, Battle_Royale};
    public enum Room {  Wait, Raise, Action, Result };
    public enum Power { Human, Monster, Neutral};//所属势力
    public enum Player_Active { Leisure,Queue,Room, Map };//空闲 队列 回合 地图
    public enum Race { Human };//种族：人类
    public enum Msg_Server_Type { CQ, Client };
    public enum Msg_Client_Type { CQ, Client };
}
