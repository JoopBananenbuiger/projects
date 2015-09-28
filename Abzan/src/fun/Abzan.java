package fun;import javax.swing.JOptionPane;public class Abzan{public static void main(String[]a){int i=0;String s="",b=(
"                                                     BA                                                                 "+
"                                                      ZA                                                                "+
"                                                       BZB    B                                                         "+
"                                                        BZNA BZ                                                         "+
"                                                         NABZN                                                          "+
"                                                         NAZAABN                                                        "+
"                                                      BABZZABZBBBNA                                                     "+
"                                                   ZBZBBAZN  AAZAABBBABZ                                                "+
"                                                ZABZBBAZA      ABZBZBZNNBZNABZNABZN                  N        BN        "+
"                                             BNBZZBBZNZ         BZBNAZAABZZBBNANAZAABZN            BBNZ  BAZAABZ        "+
"                                           BZBZABBNBZB            ZNNBNBBBNAZBZZBBNBABZBB        AZAABAABBZAZBN         "+
"    ZZB                                ZABBZNZAZAABZ                BABZBBBZANBZZNAZAABNBAB    ZZABZABBNBAAZAABAZB      "+
"    AZAA                             BNAABZNABZABB                    NZBAZAABNBNBZZBBNBABZZA AZAABABZBZNNBNAZBZBNBZ    "+
"     BBAZNAA                       ZAABZZBBZNZAZ                        AABNABBNBBBZBBBNANBNBAAZAABZNBBZNNBZBABZBBAZN   "+
" ZA   ZAABAABA                  ZAABZAZBZZBBNBA                           AZAABNBABZNNBZNNAZAABZBBBNZABNAABZBBBZNZBNA   "+
" NB ZZBBNBZBZBBAZA           ABZBZBZNNBNAZAZA                              ABNAZBZBBBZABBZNAAZAABZNABZZBBZBZBZBBAZAA    "+
"BNAABZNABZABBNZBAZAABZAZBNBBBNBAAZAABNZBBZN                                  NBNBBAZAABZANBZABBZNZAZAABZABBZNABNBNBZ    "+
"ABBNZBBNANAZAABZBABNAZBZBBBZABBZNBAZABAAN                                     BAAZZAANBAAZZANAZAZAABNZAAZAABBABBZABBN   "+
" ANBZABBZNABZZBAZAABBAABNAZBZZBBZBABZBBB                                        ZNBBZABBZBNBZBBAANBAAZZANBAAZAABNZAAZ   "+
" AABAAZBZZBBNAZBZBABNANAZAABZNNBZBZAZAA                                          BBAABZABBNAZBZABBZBABZZBBNANBZBBAANBA  "+
"  AZZANAZAZAABNZAAZAABBBABZABBNAZBZNBBZN                                        NBZBNBZNNBNZBBZBZAZAAAZAAAANBAAZZANAZA  "+
"   ZAABNZAAZAABBANBZANBZABBNBZBZBBBZNZBZB                                      NBZZBBZNZBZBNAZAABANNBZNNBNZZBZBBAANBAAZ "+
"    ZANANAZAABNZAAZAABANABZNNBNZABZNNBZBAB                                    ZNNBZNZAZAABBANBZNBBZZBBNBABZBBBNAZAANBAAZ"+
"     ZANANAZAABNZAAZAABBBNBZZBBZNABNBAAZNB                                   BANABZBBBZABBZBZAZAABANABZZBBZBBBZBNBZBBAA "+
"      NBAAZZANBAAZAABNZAAZAABBANBZZBBZBBBZB                                 NBZBBAZAABBAZBZZABZZBBZNZBZNNAANBAAZZANAZA  "+
"       ZAABNZAAZAABBBABZABBNANBZZBBZBNBNBBBN                               AZAZNAAZAABNBABZZABZBBAZAABABNBZNNBZNABZBAB  "+
"       ZBBBZNZAZAABABZBZABBZNZBZBNAANBAAZZANB                             AAZAABNZAAZAABBBZBZNNBZZBBZANBZBBAZAABZNNB    "+
"      ZBZAZAABBAZBZBBBNANBNBBBNAZBZBNBZBBBZNZB                           ZANBZBBAANBAAZZANABAZAABNZAAZAABBAABZABBNB     "+
"      ABZZAAZAABNBABZNNAZAABABBBNZABZZBBZNABZBB                         AANBAAZZANBAAZAABNZAAZAABANABZZBBZNZBZBNBZ      "+
"      BBBNAZBZZBBZNZBZBNAZAABBANBZNNBNBBBZNABNAN                       AANBAAZZANANAZAABNZAAZAABBBABZZABZNNBNBBBZBN     "+
"     BZZABNBABNANBZBBBZZBBNZZBZBBAANBAAZZANAZAZAA                     BNZAAZAABAABBZAZBNAZBNBBBNAABNBAAZAABABABZBBBZ    "+
"    ANBZABBNZ   BAANBAAZZANAZAZAABNZAAZAABANBBZABB                   ZBBBZNABNANBNBABNAZBZNNBZNBAZAABBA  ABNBBBZNABN    "+
"   ANBZ           BBAANBAAZZANBAAZAABNZAAZAABABNBZA                 BBNBZBZNNBZNZBNZBAZAABBBABZNNB       NBNBZNZBNAN    "+
"                    BZZABZZBBNAAAANBAAZZANBAAZAABNZA               AZAABABNBZNNBZBABZNABZBBBNA               NBNANAZA   "+
"                       ABBANBZZABNAZBZZBBZNZBZBBAANBA             AZZANBAAZAABNZAAZAABANNBNB                     ZBZBB  "+
"                        BNAZBZBNBNAZBZNNBNBNBZNZAZAABB           BABZNNBZNBBZAZAANBAAZZAN                               "+
"                          BAAZAABNZAAZAABBANBZABBZNZBZBA        BNANBNBABZBBBNAABNAABZBB                                "+
"                                AZAABAANBZZBBNBABZABBZBAB      ZBBBZNAAANBAAZZANBAAZAA                                  "+
"                                  BNZAAZAABBBABZBBBZNBBNAA    BZNABZBBAZAABABNBZABBN                                    "+
"                                      AZBZBABZBBBZNZAANBAAZ  ZANABAZAABNZAAZAABBBABZ                                    "+
"                                        BBBZNBBNAABZNABZBBAZAABZNNBZBZAZAABANBBZAB                                      "+
"                                          BZNABZABBZBABNZBAANBAAZZANABAZAABNZAAZ                                        "+
"                                            AABBBABZBBBZNBBNAABZNABZBBAZAABZNN                                          "+
"                                             BZBZAZAABBAABZNABZBBBZNZBNBABNZB                                           "+
"                                                  AANBAAZZANABAZAABNZAAZAAB                                             "+
"                                                  BBABZBBBZNBBNAABZNABZBB                                               "+
"                                                     AZAABZNNBZBZAZAAB                                                  "+
"                                                   BANBZZBBZNAB  ZBBBZNZ                                                "+
"                                                                    BZANBZ                                              "+
"                                                                          BB                                            "
).replace(" ","").replace("A","0").replace("B","1").replace("Z","2").replace("N","3");for(;i<2120;i+=4)s+=(char)Integer.
parseInt(b.substring(i,i+4),4);JOptionPane.showMessageDialog(null,s);}}