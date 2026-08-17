.class LB1/b$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/bumptech/glide/load/data/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final g:[B

.field private final h:LB1/b$b;


# direct methods
.method constructor <init>([BLB1/b$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/b$c;->g:[B

    .line 5
    .line 6
    iput-object p2, p0, LB1/b$c;->h:LB1/b$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public cleanup()V
    .locals 0

    .line 1
    return-void
.end method

.method public getDataClass()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/b$c;->h:LB1/b$b;

    .line 2
    .line 3
    invoke-interface {v0}, LB1/b$b;->getDataClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getDataSource()Lv1/a;
    .locals 1

    .line 1
    sget-object v0, Lv1/a;->g:Lv1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadData(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LB1/b$c;->h:LB1/b$b;

    .line 2
    .line 3
    iget-object v0, p0, LB1/b$c;->g:[B

    .line 4
    .line 5
    invoke-interface {p1, v0}, LB1/b$b;->a([B)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
