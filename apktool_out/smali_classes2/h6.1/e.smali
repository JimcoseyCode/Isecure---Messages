.class public final synthetic Lh6/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/k;


# instance fields
.field public final synthetic a:Lh6/g;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lh6/g;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh6/e;->a:Lh6/g;

    .line 5
    .line 6
    iput p2, p0, Lh6/e;->b:I

    .line 7
    .line 8
    iput p3, p0, Lh6/e;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LP4/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lh6/e;->a:Lh6/g;

    .line 2
    .line 3
    iget v1, p0, Lh6/e;->b:I

    .line 4
    .line 5
    iget v2, p0, Lh6/e;->c:I

    .line 6
    .line 7
    check-cast p1, Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, p1}, Lh6/g;->B(IILjava/util/List;)LP4/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
