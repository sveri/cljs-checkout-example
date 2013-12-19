;(function(){
function a(e) {
  return console.log("Hello apptwo", e)
}
var b = ["apptwo", "cljs", "test", "greet_apptwo"], c = this;
b[0] in c || !c.execScript || c.execScript("var " + b[0]);
for(var d;b.length && (d = b.shift());) {
  b.length || void 0 === a ? c = c[d] ? c[d] : c[d] = {} : c[d] = a
}
;
})();
