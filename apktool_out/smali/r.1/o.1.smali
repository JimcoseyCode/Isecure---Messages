.class public final synthetic Lr/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/a;


# instance fields
.field public final synthetic a:Lr/y;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lr/y;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/o;->a:Lr/y;

    .line 5
    .line 6
    iput p2, p0, Lr/o;->b:I

    .line 7
    .line 8
    iput p3, p0, Lr/o;->c:I

    .line 9
    .line 10
    iput p4, p0, Lr/o;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lm5/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lr/o;->a:Lr/y;

    .line 2
    .line 3
    iget v1, p0, Lr/o;->b:I

    .line 4
    .line 5
    iget v2, p0, Lr/o;->c:I

    .line 6
    .line 7
    iget v3, p0, Lr/o;->d:I

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Void;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, Lr/y;->t(Lr/y;IIILjava/lang/Void;)Lm5/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
