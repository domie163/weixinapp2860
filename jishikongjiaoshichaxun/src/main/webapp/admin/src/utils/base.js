const base = {
    get() {
        return {
            url : "http://localhost:8080/jishikongjiaoshichaxun/",
            name: "jishikongjiaoshichaxun",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jishikongjiaoshichaxun/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "即时空教室查询小程序"
        } 
    }
}
export default base
