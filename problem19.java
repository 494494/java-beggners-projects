import java.util.*;
public class Main{
    public static void main(String[] args){
        String s="""
<<t>{{<-><(<( )v><y<z >g)< <f>>[*]^>[z]e}d}(<w>h)>
<{t}f>{%}<< ><t>><<d>u(v)[c][(f(g))z<y>](t)>(f)
<<*>{*}u>{%}<(>)[%]{d}b[f]>[[( )u]{(g)*[a][d](v)<g>}{(<c^e)e}]
f-}(({{}[+]^)a<[e]w>)[v{a}]<g>{ }(*)<[/(b)]<d>{^{b}(a){g{y}}}>
[h{v}]}x)(^<b>{t(( ){^})<v{e}>{w{+<u( )[{/}x]>}}((e))[a]
<f<({t}c)*>{[[z]z]h([[w][(/)a]+]+)}>[<v>{e}[{<u>w<g>}{c}a] <h>
(-)<g>(v)[([*](^( )) )(h[ ])(w{a})(y)][a(z)]
<<w>->v^<%>}(^)[{e}z]((^{x[[ ]-]})({f}c)< ><({) >)
[d]{x}{{(w)(t)z(e)}}{<([/]f)[-]^>f}[{ }[b]b]{<a(v)>-<y>}
< >{(g[ ])g}{f}{d}[u(g)][w][f][c(h)[-]](){<d>b<(^)< >x>( )}
<<[/]c>y><>[e](h)(/)<[(/)d<b[a]> c]]< >v<+>>(-)<<->u>
<<b[a][ ]{^}><%>>([[/ v]e){(d)+}((c)%)(%)(v)[h]
((*)<v>(<d>{t[-]{/}}<( )y{a}>d(y)<x(^){a}>){-})[ ]
{x}{<< >[-]([b]y)u[*]<w>>( )f}{/}(<v(f)>(%)<v>)
 (*{u< >})>[u<v>{h}([[b]^]<g>u)]{[c]{+}^{*}}
[[%<a></>]][c<v>][[x]b]<g<z>>[{[t]v}u(u) <->(%)
[[u]][b{w[ ]}[<y>{y(z){c}( (w){b})[b]}/]]([w]z){f}
{[<t>{ }v -}(c)]<z><[h(y)]v>{<v>[(w)(y)(y)*]y}}<+>((^)e){ }{ }(w)
""";
        String[] str1=(s.trim()).split("\\R");
        
        ArrayList<String> str=new ArrayList(Arrays.asList(str1));
        
        
        
        for(String i:str){
            Stack<Character> stack1=new Stack();
            boolean flag=true;
            char [] a=i.toCharArray();
            for(Character c:a){
                
                if(c=='(' || c=='['|| c=='{' || c=='<'){
                    stack1.push(c);
                }
                if(c==')' || c==']' || c=='}' || c=='>'){
                    if(stack1.isEmpty()){
                        flag=false;
                        break;
                    }
                     char popped =stack1.pop();
                     flag =match(popped,c);
                     if(!flag){
                         break;
                     }
                }
            }
            if(!stack1.isEmpty())flag=false;
            if(flag){System.out.print("1 ");}else{System.out.print("0 ");}
            
        }
    }
    public static boolean match(char popped, char c) {
    return (popped == '(' && c == ')') ||
           (popped == '[' && c == ']') ||
           (popped == '{' && c == '}') ||
           (popped == '<' && c == '>');
    }

}
