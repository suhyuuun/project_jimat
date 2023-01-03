$.ajax({
    url:'https://dapi.kakao.com/v2/local/search/address.json?query='+encodeURIComponent('숭의동'),
    type:'GET',
    Headers:{'Authorization' : 'KaKaoAK f64ef4364a8d78dd217a5c5e1fd6b91e'},
sucess:function(data){
    console.log(data);
},
error : function(e){
    console.log(e);
}
});
