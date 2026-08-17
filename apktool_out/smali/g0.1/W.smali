.class public final synthetic Lg0/W;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lg0/I$g;

.field public final synthetic h:Landroid/media/MediaCodec$BufferInfo;

.field public final synthetic i:Landroid/media/MediaCodec;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lg0/I$g;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/W;->g:Lg0/I$g;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/W;->h:Landroid/media/MediaCodec$BufferInfo;

    .line 7
    .line 8
    iput-object p3, p0, Lg0/W;->i:Landroid/media/MediaCodec;

    .line 9
    .line 10
    iput p4, p0, Lg0/W;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/W;->g:Lg0/I$g;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/W;->h:Landroid/media/MediaCodec$BufferInfo;

    .line 4
    .line 5
    iget-object v2, p0, Lg0/W;->i:Landroid/media/MediaCodec;

    .line 6
    .line 7
    iget v3, p0, Lg0/W;->j:I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lg0/I$g;->e(Lg0/I$g;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
