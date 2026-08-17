.class public final LF/G0;
.super LF/q0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final o:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Landroid/view/Surface;)V
    .locals 0

    .line 3
    invoke-direct {p0}, LF/q0;-><init>()V

    .line 4
    iput-object p1, p0, LF/G0;->o:Landroid/view/Surface;

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, LF/q0;-><init>(Landroid/util/Size;I)V

    .line 2
    iput-object p1, p0, LF/G0;->o:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public o()Lm5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF/G0;->o:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-static {v0}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
