.class LN5/h$c$a;
.super LN5/h$d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN5/h$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:LN5/h$c;


# direct methods
.method constructor <init>(LN5/h$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN5/h$c$a;->k:LN5/h$c;

    .line 2
    .line 3
    iget-object p1, p1, LN5/h$c;->g:LN5/h;

    .line 4
    .line 5
    invoke-direct {p0, p1}, LN5/h$d;-><init>(LN5/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LN5/h$d;->b()LN5/h$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LN5/h$e;->l:Ljava/lang/Object;

    .line 6
    .line 7
    return-object v0
.end method
