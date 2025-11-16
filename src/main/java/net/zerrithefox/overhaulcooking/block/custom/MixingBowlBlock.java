package net.zerrithefox.overhaulcooking.block.custom;

public class MixingBowlBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE =
            Block.crateCuboidShape(2, 0, 2, 14, 13, 14);
    public static final MapCodec<MixingBowlBlock> CODEC = MixingBowlBlock.createCodec(MixingBowlBlock::new);

    public MixingBowl(Settings Settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, Blockstate state) {
        return ;
    }

    @Override
    protected BlockRenderType get RenderType(BlockState state) {
        return BlockRenderTypel.MODEL
    }

    @Override
    protected void onSateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(BlockEntity instanceof MixingBowlEntity) {
                ItemSchatterer.spawn(world, pos ((MixingBowlEntity) blockEntity));
                world.updateComparator(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

}