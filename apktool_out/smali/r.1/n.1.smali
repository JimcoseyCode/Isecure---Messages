.class public final synthetic Lr/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/a;


# instance fields
.field public final synthetic a:Lr/y;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lr/y;Ljava/util/List;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/n;->a:Lr/y;

    .line 5
    .line 6
    iput-object p2, p0, Lr/n;->b:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lr/n;->c:I

    .line 9
    .line 10
    iput p4, p0, Lr/n;->d:I

    .line 11
    .line 12
    iput p5, p0, Lr/n;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lm5/a;
    .locals 6

    .line 1
    iget-object v0, p0, Lr/n;->a:Lr/y;

    .line 2
    .line 3
    iget-object v1, p0, Lr/n;->b:Ljava/util/List;

    .line 4
    .line 5
    iget v2, p0, Lr/n;->c:I

    .line 6
    .line 7
    iget v3, p0, Lr/n;->d:I

    .line 8
    .line 9
    iget v4, p0, Lr/n;->e:I

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    check-cast v5, Ljava/lang/Void;

    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lr/y;->z(Lr/y;Ljava/util/List;IIILjava/lang/Void;)Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
