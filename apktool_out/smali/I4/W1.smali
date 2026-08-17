.class final LI4/W1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv5/d;


# static fields
.field static final a:LI4/W1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LI4/W1;

    .line 2
    .line 3
    invoke-direct {v0}, LI4/W1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI4/W1;->a:LI4/W1;

    .line 7
    .line 8
    const-string v0, "logEventKey"

    .line 9
    .line 10
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LI4/J0;

    .line 15
    .line 16
    invoke-direct {v1}, LI4/J0;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v2}, LI4/J0;->a(I)LI4/J0;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, LI4/J0;->b()LI4/N0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lv5/c$b;->b(Ljava/lang/annotation/Annotation;)Lv5/c$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lv5/c$b;->a()Lv5/c;

    .line 32
    .line 33
    .line 34
    const-string v0, "eventCount"

    .line 35
    .line 36
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, LI4/J0;

    .line 41
    .line 42
    invoke-direct {v1}, LI4/J0;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x2

    .line 46
    invoke-virtual {v1, v2}, LI4/J0;->a(I)LI4/J0;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, LI4/J0;->b()LI4/N0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Lv5/c$b;->b(Ljava/lang/annotation/Annotation;)Lv5/c$b;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lv5/c$b;->a()Lv5/c;

    .line 58
    .line 59
    .line 60
    const-string v0, "inferenceDurationStats"

    .line 61
    .line 62
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, LI4/J0;

    .line 67
    .line 68
    invoke-direct {v1}, LI4/J0;-><init>()V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x3

    .line 72
    invoke-virtual {v1, v2}, LI4/J0;->a(I)LI4/J0;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, LI4/J0;->b()LI4/N0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lv5/c$b;->b(Ljava/lang/annotation/Annotation;)Lv5/c$b;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lv5/c$b;->a()Lv5/c;

    .line 84
    .line 85
    .line 86
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
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    check-cast p2, Lv5/e;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method
