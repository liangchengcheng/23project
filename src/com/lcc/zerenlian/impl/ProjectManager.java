package com.lcc.zerenlian.impl;


public class ProjectManager extends Handler{
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //项目经理的权限比较小，只能在500之内
        if (fee < 500){
            //为了测试，只要是我请求的就直接过
            if ("梁铖城".equals(user)){
                str = "成功了";
            }else {
                str = "失败了";
            }
        }else {
            //超过了500就直接传递给更高级的经理
            if (getSuccessor() != null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }

        return str;

    }
}
