.class public final LJ7/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ7/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJ7/f;)LJ7/c;
    .locals 1

    .line 1
    const-string v0, "functionTypeKind"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LJ7/f$a;->e:LJ7/f$a;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p1, LJ7/c;->h:LJ7/c;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object v0, LJ7/f$d;->e:LJ7/f$d;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p1, LJ7/c;->i:LJ7/c;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    sget-object v0, LJ7/f$b;->e:LJ7/f$b;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object p1, LJ7/c;->j:LJ7/c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    sget-object v0, LJ7/f$c;->e:LJ7/f$c;

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    sget-object p1, LJ7/c;->k:LJ7/c;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_3
    sget-object p1, LJ7/c;->l:LJ7/c;

    .line 51
    .line 52
    return-object p1
.end method
