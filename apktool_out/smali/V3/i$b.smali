.class final LV3/i$b;
.super LV3/o$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:LV3/o$c;

.field private b:LV3/o$b;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LV3/o$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()LV3/o;
    .locals 4

    .line 1
    new-instance v0, LV3/i;

    .line 2
    .line 3
    iget-object v1, p0, LV3/i$b;->a:LV3/o$c;

    .line 4
    .line 5
    iget-object v2, p0, LV3/i$b;->b:LV3/o$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, LV3/i;-><init>(LV3/o$c;LV3/o$b;LV3/i$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b(LV3/o$b;)LV3/o$a;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/i$b;->b:LV3/o$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(LV3/o$c;)LV3/o$a;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/i$b;->a:LV3/o$c;

    .line 2
    .line 3
    return-object p0
.end method
