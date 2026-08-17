.class final LJ4/H2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv5/d;


# static fields
.field static final a:LJ4/H2;

.field private static final b:Lv5/c;

.field private static final c:Lv5/c;

.field private static final d:Lv5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LJ4/H2;

    .line 2
    .line 3
    invoke-direct {v0}, LJ4/H2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ4/H2;->a:LJ4/H2;

    .line 7
    .line 8
    const-string v0, "language"

    .line 9
    .line 10
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, LJ4/f;

    .line 15
    .line 16
    invoke-direct {v1}, LJ4/f;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v2}, LJ4/f;->a(I)LJ4/f;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, LJ4/f;->b()LJ4/j;

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
    sput-object v0, LJ4/H2;->b:Lv5/c;

    .line 36
    .line 37
    const-string v0, "durationMs"

    .line 38
    .line 39
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, LJ4/f;

    .line 44
    .line 45
    invoke-direct {v1}, LJ4/f;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-virtual {v1, v2}, LJ4/f;->a(I)LJ4/f;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, LJ4/f;->b()LJ4/j;

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
    sput-object v0, LJ4/H2;->c:Lv5/c;

    .line 65
    .line 66
    const-string v0, "errorCode"

    .line 67
    .line 68
    invoke-static {v0}, Lv5/c;->a(Ljava/lang/String;)Lv5/c$b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, LJ4/f;

    .line 73
    .line 74
    invoke-direct {v1}, LJ4/f;-><init>()V

    .line 75
    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    invoke-virtual {v1, v2}, LJ4/f;->a(I)LJ4/f;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, LJ4/f;->b()LJ4/j;

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
    sput-object v0, LJ4/H2;->d:Lv5/c;

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
