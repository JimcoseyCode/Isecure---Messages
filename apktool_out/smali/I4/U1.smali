.class final LI4/U1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv5/d;


# static fields
.field static final a:LI4/U1;

.field private static final b:Lv5/c;

.field private static final c:Lv5/c;

.field private static final d:Lv5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LI4/U1;

    .line 2
    .line 3
    invoke-direct {v0}, LI4/U1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI4/U1;->a:LI4/U1;

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
    move-result-object v0

    .line 35
    sput-object v0, LI4/U1;->b:Lv5/c;

    .line 36
    .line 37
    const-string v0, "eventCount"

    .line 38
    .line 39
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, LI4/J0;

    .line 44
    .line 45
    invoke-direct {v1}, LI4/J0;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-virtual {v1, v2}, LI4/J0;->a(I)LI4/J0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, LI4/J0;->b()LI4/N0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Lv5/c$b;->b(Ljava/lang/annotation/Annotation;)Lv5/c$b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lv5/c$b;->a()Lv5/c;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, LI4/U1;->c:Lv5/c;

    .line 65
    .line 66
    const-string v0, "inferenceDurationStats"

    .line 67
    .line 68
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, LI4/J0;

    .line 73
    .line 74
    invoke-direct {v1}, LI4/J0;-><init>()V

    .line 75
    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    invoke-virtual {v1, v2}, LI4/J0;->a(I)LI4/J0;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, LI4/J0;->b()LI4/N0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Lv5/c$b;->b(Ljava/lang/annotation/Annotation;)Lv5/c$b;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lv5/c$b;->a()Lv5/c;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, LI4/U1;->d:Lv5/c;

    .line 94
    .line 95
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
    .locals 2

    .line 1
    check-cast p1, LI4/e1;

    .line 2
    .line 3
    check-cast p2, Lv5/e;

    .line 4
    .line 5
    sget-object v0, LI4/U1;->b:Lv5/c;

    .line 6
    .line 7
    invoke-virtual {p1}, LI4/e1;->a()LI4/c1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {p2, v0, v1}, Lv5/e;->a(Lv5/c;Ljava/lang/Object;)Lv5/e;

    .line 12
    .line 13
    .line 14
    sget-object v0, LI4/U1;->c:Lv5/c;

    .line 15
    .line 16
    invoke-virtual {p1}, LI4/e1;->c()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p2, v0, v1}, Lv5/e;->a(Lv5/c;Ljava/lang/Object;)Lv5/e;

    .line 21
    .line 22
    .line 23
    sget-object v0, LI4/U1;->d:Lv5/c;

    .line 24
    .line 25
    invoke-virtual {p1}, LI4/e1;->b()LI4/n6;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p2, v0, p1}, Lv5/e;->a(Lv5/c;Ljava/lang/Object;)Lv5/e;

    .line 30
    .line 31
    .line 32
    return-void
.end method
