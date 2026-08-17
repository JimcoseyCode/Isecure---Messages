.class public final LD8/r;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LD8/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD8/r;

    .line 2
    .line 3
    invoke-direct {v0}, LD8/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD8/r;->a:LD8/r;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(LC8/M0;)Z
    .locals 4

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LC8/c;->a:LC8/c;

    .line 7
    .line 8
    sget-object v1, LD8/s;->a:LD8/s;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v1, v2, v3}, LD8/s;->I0(ZZ)LC8/u0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p1}, LC8/L;->c(LC8/S;)LC8/d0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v2, LC8/u0$c$b;->a:LC8/u0$c$b;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, v2}, LC8/c;->a(LC8/u0;LG8/j;LC8/u0$c;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method
