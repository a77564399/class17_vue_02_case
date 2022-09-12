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
            axios.get('/class17_vue_02_case/user/findAll.do')
                .then(function (response) {
                    // handle success
                    vue_this.userList = response.data;
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                })
        },
        findById: function (){

        },
        update: function () {

        }
    },
    created: function (){//当页面加载时触发请求，查询所有
        this.findAll();
    }

})