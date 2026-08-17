.class final LV3/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field static final a:LV3/b$c;

.field private static final b:Lv5/c;

.field private static final c:Lv5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV3/b$c;

    .line 2
    .line 3
    invoke-direct {v0}, LV3/b$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV3/b$c;->a:LV3/b$c;

    .line 7
    .line 8
    const-string v0, "clientType"

    .line 9
    .line 10
    invoke-static {v0}, Lv5/c;->d(Ljava/lang/String;)Lv5/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LV3/b$c;->b:Lv5/c;

    .line 15
    .line 16
    const-string v0, "androidClientInfo"

    .line 17
    .line 18
    invoke-static {v0}, Lv5/c;->d(Ljava/lang/String;)Lv5/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LV3/b$c;->c:Lv5/c;

    .line 23
    .line 24
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
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LV3/k;

    .line 2
    .line 3
    check-cast p2, Lv5/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LV3/b$c;->b(LV3/k;Lv5/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(LV3/k;Lv5/e;)V
    .locals 2

    .line 1
    sget-object v0, LV3/b$c;->b:Lv5/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LV3/k;->c()LV3/k$b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Lv5/e;->a(Lv5/c;Ljava/lang/Object;)Lv5/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, LV3/b$c;->c:Lv5/c;

    .line 11
    .line 12
    invoke-virtual {p1}, LV3/k;->b()LV3/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p2, v0, p1}, Lv5/e;->a(Lv5/c;Ljava/lang/Object;)Lv5/e;

    .line 17
    .line 18
    .line 19
    return-void
.end method
