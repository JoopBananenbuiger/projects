package fun;import javax.swing.JOptionPane;public class Abzan{public static void main(String[]a){int i,c,d;String s="",b=(
"                                                     AZ                                                                 "+
"                                                      BZ                                                                "+
"                                                       ABA    A                                                         "+
"                                                        ABNZ AB                                                         "+
"                                                         NZABN                                                          "+
"                                                         NZBZZAN                                                        "+
"                                                      AZABBZABAAANZ                                                     "+
"                                                   BABAAZBN  ZZBZZAAAZAB                                                "+
"                                                BZABAAZBZ      ZABABABNNABNZABNZABN                  N        AN        "+
"                                             ANABBAABNB         ABANZBZZABBAANZNZBZZABN            AANB  AZBZZAB        "+
"                                           ABABZAANABA            BNNANAAANZBABBAANAZABAA        ZBZZAZZAABZBAN         "+
"    BBA                                BZAABNBZBZZAB                AZABAAABZNABBNZBZZANAZA    BBZABZAANAZZBZZAZBA      "+
"    ZBZZ                             ANZZABNZABZAA                    NBAZBZZANANABBAANAZABBZ ZBZZAZABABNNANZBABANAB    "+
"     AAZBNZZ                       BZZABBAABNBZB                        ZZANZAANAAABAAANZNANAZZBZZABNAABNNABAZABAAZBN   "+
" BZ   BZZAZZAZ                  BZZABZBABBAANAZ                           ZBZZANAZABNNABNNZBZZABAAANBZANZZABAAABNBANZ   "+
" NA BBAANABABAAZBZ           ZABABABNNANZBZBZ                              ZANZBABAAABZAABNZZBZZABNZABBAABABABAAZBZZ    "+
"ANZZABNZABZAANBAZBZZABZBANAAANAZZBZZANBAABN                                  NANAAZBZZABZNABZAABNBZBZZABZAABNZANANAB    "+
"ZAANBAANZNZBZZABAZANZBABAAABZAABNAZBZAZZN                                     AZZBBZZNAZZBBZNZBZBZZANBZZBZZAAZAABZAAN   "+
" ZNABZAABNZABBAZBZZAAZZANZBABBAABAZABAAA                                        BNAABZAABANABAAZZNAZZBBZNAZZBZZANBZZB   "+
" ZZAZZBABBAANZBABAZANZNZBZZABNNABABZBZZ                                          AAZZABZAANZBABZAABAZABBAANZNABAAZZNAZ  "+
"  ZBBZNZBZBZZANBZZBZZAAAZABZAANZBABNAABN                                        NABANABNNANBAABABZBZZZBZZZZNAZZBBZNZBZ  "+
"   BZZANBZZBZZAAZNABZNABZAANABABAAABNBABA                                      NABBAABNBABANZBZZAZNNABNNANBBABAAZZNAZZB "+
"    BZNZNZBZZANBZZBZZAZNZABNNANBZABNNABAZA                                    BNNABNBZBZZAAZNABNAABBAANAZABAAANZBZZNAZZB"+
"     BZNZNZBZZANBZZBZZAAANABBAABNZANAZZBNA                                   AZNZABAAABZAABABZBZZAZNZABBAABAAABANABAAZZ "+
"      NAZZBBZNAZZBZZANBZZBZZAAZNABBAABAAABA                                 NABAAZBZZAAZBABBZABBAABNBABNNZZNAZZBBZNZBZ  "+
"       BZZANBZZBZZAAAZABZAANZNABBAABANANAAAN                               ZBZBNZZBZZANAZABBZABAAZBZZAZANABNNABNZABAZA  "+
"       BAAABNBZBZZAZABABZAABNBABANZZNAZZBBZNA                             ZZBZZANBZZBZZAAABABNNABBAABZNABAAZBZZABNNA    "+
"      BABZBZZAAZBABAAANZNANAAANZBABANABAAABNBA                           BZNABAAZZNAZZBBZNZAZBZZANBZZBZZAAZZABZAANA     "+
"      ZABBZZBZZANAZABNNZBZZAZAAANBZABBAABNZABAA                         ZZNAZZBBZNAZZBZZANBZZBZZAZNZABBAABNBABANAB      "+
"      AAANZBABBAABNBABANZBZZAAZNABNNANAAABNZANZN                       ZZNAZZBBZNZNZBZZANBZZBZZAAAZABBZABNNANAAABAN     "+
"     ABBZANAZANZNABAAABBAANBBABAAZZNAZZBBZNZBZBZZ                     ANBZZBZZAZZAABZBANZBANAAANZZANAZZBZZAZAZABAAAB    "+
"    ZNABZAANB   AZZNAZZBBZNZBZBZZANBZZBZZAZNAABZAA                   BAAABNZANZNANAZANZBABNNABNAZBZZAAZ  ZANAAABNZAN    "+
"   ZNAB           AAZZNAZZBBZNAZZBZZANBZZBZZAZANABZ                 AANABABNNABNBANBAZBZZAAAZABNNA       NANABNBANZN    "+
"                    ABBZABBAANZZZZNAZZBBZNAZZBZZANBZ               ZBZZAZANABNNABAZABNZABAAANZ               NANZNZBZ   "+
"                       ZAAZNABBZANZBABBAABNBABAAZZNAZ             ZBBZNAZZBZZANBZZBZZAZNNANA                     BABAA  "+
"                        ANZBABANANZBABNNANANABNBZBZZAA           AZABNNABNAABZBZZNAZZBBZN                               "+
"                          AZZBZZANBZZBZZAAZNABZAABNBABAZ        ANZNANAZABAAANZZANZZABAA                                "+
"                                ZBZZAZZNABBAANAZABZAABAZA      BAAABNZZZNAZZBBZNAZZBZZ                                  "+
"                                  ANBZZBZZAAAZABAAABNAANZZ    ABNZABAAZBZZAZANABZAAN                                    "+
"                                      ZBABAZABAAABNBZZNAZZB  BZNZAZBZZANBZZBZZAAAZAB                                    "+
"                                        AAABNAANZZABNZABAAZBZZABNNABABZBZZAZNAABZA                                      "+
"                                          ABNZABZAABAZANBAZZNAZZBBZNZAZBZZANBZZB                                        "+
"                                            ZZAAAZABAAABNAANZZABNZABAAZBZZABNN                                          "+
"                                             ABABZBZZAAZZABNZABAAABNBANAZANBA                                           "+
"                                                  ZZNAZZBBZNZAZBZZANBZZBZZA                                             "+
"                                                  AAZABAAABNAANZZABNZABAA                                               "+
"                                                     ZBZZABNNABABZBZZA                                                  "+
"                                                   AZNABBAABNZA  BAAABNB                                                "+
"                                                                    ABZNAB                                              "+
"                                                                          AA                                            "
).replace(" ","");i=0;while(i<'5'*'('){for(d=0,c=d;d<4;d++)c=(c<<2)+b.substring(i,++i).hashCode()%0XF%4;s+=(char)c;}
JOptionPane.showMessageDialog(null,s);}}