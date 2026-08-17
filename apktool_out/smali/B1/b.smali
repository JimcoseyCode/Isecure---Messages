.class public LB1/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB1/b$b;,
        LB1/b$c;,
        LB1/b$d;,
        LB1/b$a;
    }
.end annotation


# instance fields
.field private final a:LB1/b$b;


# direct methods
.method public constructor <init>(LB1/b$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/b;->a:LB1/b$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a([BIILv1/h;)LB1/n$a;
    .locals 1

    .line 1
    new-instance p2, LB1/n$a;

    .line 2
    .line 3
    new-instance p3, LP1/c;

    .line 4
    .line 5
    invoke-direct {p3, p1}, LP1/c;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, LB1/b$c;

    .line 9
    .line 10
    iget-object v0, p0, LB1/b;->a:LB1/b$b;

    .line 11
    .line 12
    invoke-direct {p4, p1, v0}, LB1/b$c;-><init>([BLB1/b$b;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, p3, p4}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public b([B)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LB1/b;->a([BIILv1/h;)LB1/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LB1/b;->b([B)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
