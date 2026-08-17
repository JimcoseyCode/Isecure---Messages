.class public Lcom/bumptech/glide/integration/okhttp3/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/integration/okhttp3/a$a;
    }
.end annotation


# instance fields
.field private final a:Le9/e$a;


# direct methods
.method public constructor <init>(Le9/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/integration/okhttp3/a;->a:Le9/e$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LB1/h;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    new-instance p2, LB1/n$a;

    .line 2
    .line 3
    new-instance p3, Lu1/a;

    .line 4
    .line 5
    iget-object p4, p0, Lcom/bumptech/glide/integration/okhttp3/a;->a:Le9/e$a;

    .line 6
    .line 7
    invoke-direct {p3, p4, p1}, Lu1/a;-><init>(Le9/e$a;LB1/h;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p2, p1, p3}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    .line 11
    .line 12
    .line 13
    return-object p2
.end method

.method public b(LB1/h;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public bridge synthetic buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    check-cast p1, LB1/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/integration/okhttp3/a;->a(LB1/h;IILv1/h;)LB1/n$a;

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
    check-cast p1, LB1/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/integration/okhttp3/a;->b(LB1/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
