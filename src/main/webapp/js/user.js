new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]
    },
    methods:{
        findAll: function (){
            var vue_this = this;
            // Make a request for a user with a given ID
            axios.get('/class17/user/findAll.do')
                .then(function (response) {
                    // handle success
                    vue_this.userList = response.data;
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
        },
        findById: function (userid){
            var vue_this = this;
            // Make a request for a user with a given ID
            axios.get('/class17/user/findById.do',{params: {id:userid}})
                .then(function (response) {
                    // handle success
                    vue_this.user = response.data;//响应数据给userList赋值
                //    显示修改数据的modal
                    $("#myModal").modal("show")
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
        },
        update: function (user) {
            var vue_this = this;
            axios.post('/class17/user/updateUser.do', vue_this.user)
                .then(function (response) {
                    alert(vue_this.user)
                    vue_this.findAll()
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
    created: function (){//当页面加载时触发请求，查询所有
        this.findAll();
    }

})