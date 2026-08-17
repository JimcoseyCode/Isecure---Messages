.class public final synthetic Lr/j2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lr/m2;

.field public final synthetic h:Lr/g2;


# direct methods
.method public synthetic constructor <init>(Lr/m2;Lr/g2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/j2;->g:Lr/m2;

    .line 5
    .line 6
    iput-object p2, p0, Lr/j2;->h:Lr/g2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/j2;->g:Lr/m2;

    .line 2
    .line 3
    iget-object v1, p0, Lr/j2;->h:Lr/g2;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr/m2;->A(Lr/m2;Lr/g2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
