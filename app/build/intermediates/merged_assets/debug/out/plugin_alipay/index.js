module.exports = function(plugin){
    const runtime = plugin.runtime;
    const scope = plugin.topLevelScope;

    function alipay(){
    }

    alipay.stringFromJava = plugin.getStringFromJava();

    alipay.pay = function(message){
        plugin.pay(message);
    }

//    alipay.remoteAdd = function (a, b) {
//        return plugin.waitForConnection().call('add', {
//          a: a,
//          b: b
//        }, null).get('sum');
//    }

    return alipay;
}